import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.api.tasks.testing.logging.TestLogEvent

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.6.0"
    id("io.gitlab.arturbosch.detekt") version "1.19.0-RC2"
    java
}

detekt {
    toolVersion = "1.19.0-RC2"
    buildUponDefaultConfig = true
}

tasks {
    test {
        filter {
            // all classes in package, recursively
            includeTestsMatching("lms_126.*")
            includeTestsMatching("lms_127.*")
            includeTestsMatching("lms_129.*")
            includeTestsMatching("lms_130.*")
            includeTestsMatching("lms_131.*")
            includeTestsMatching("lms_132.*")
            includeTestsMatching("lms_133.*")
            includeTestsMatching("lms_135.*")
        }

        testLogging {
            // set options for log level LIFECYCLE
            events.add(TestLogEvent.FAILED)
            exceptionFormat = TestExceptionFormat.FULL
            showExceptions = true
            showCauses = true
            showStackTraces = false

            // set options for log level DEBUG and INFO
            debug {
                events.add(TestLogEvent.STARTED)
                events.add(TestLogEvent.FAILED)
                events.add(TestLogEvent.PASSED)
                events.add(TestLogEvent.SKIPPED)
                events.add(TestLogEvent.STANDARD_ERROR)
                events.add(TestLogEvent.STANDARD_OUT)
                exceptionFormat = TestExceptionFormat.FULL
            }
            info.events = debug.events
            info.exceptionFormat = debug.exceptionFormat

            fun color(percentage: Int): String {
                val red = "D53644"
                val green = "31C452"
                val yellow = "E47202"

                return when (percentage) {
                    0 -> red
                    100 -> green
                    else -> yellow
                }
            }

            fun badgeMetadata(testCount: Long, successTestCount: Long) {
                try {
                    val fileName = "${System.getProperty("user.dir")}/badge.txt"

                    val file = File(fileName)
                    if (file.exists()) file.delete()

                    if(file.createNewFile()){
                        val passingPercentage = ((successTestCount.toDouble()/testCount.toDouble()) * 100).toInt()
                        file.writeText(text = "$passingPercentage\n${color(passingPercentage)}")
                    } else{
                        println("$fileName not created.")
                    }
                } catch(_: java.io.IOException) { }
            }

            // waiting for https://github.com/gradle/gradle/issues/5431 to have a better way
            addTestListener(object : TestListener {
                override fun beforeSuite(suite: TestDescriptor) {}
                override fun beforeTest(testDescriptor: TestDescriptor) {}
                override fun afterTest(testDescriptor: TestDescriptor, result: TestResult) {}
                override fun afterSuite(desc: TestDescriptor, result: TestResult) {
                    if (desc.parent == null) {
                        val output = "Results: ${result.resultType} (${result.testCount} tests, ${result.successfulTestCount} passed, ${result.failedTestCount} failed, ${result.skippedTestCount} skipped)"
                        val startItem = "|  "
                        val endItem = "  |"
                        val repeatLength = startItem.length + output.length + endItem.length
                        println("\n" + ("-".repeat(repeatLength)) + "\n" + startItem + output + endItem + "\n" + ("-".repeat(repeatLength)))
                        badgeMetadata(testCount = result.testCount, successTestCount = result.successfulTestCount)
                    }
                }
            })
        }
    }

    compileKotlin {
        kotlinOptions.suppressWarnings = true
    }
}

group "se.linerotech"
version "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlin:kotlin-test")
    implementation("junit:junit:4.12")

    detektPlugins ("io.gitlab.arturbosch.detekt:detekt-formatting:1.19.0-RC2")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}

