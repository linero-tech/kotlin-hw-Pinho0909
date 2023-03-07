package lms_129

fun task9(temperature: String): String {

    val number = temperature.substring(0,temperature.length-1).toDouble()
    val result = when (temperature.last().toString().uppercase()) {
        "C" -> {
            (number * 9 / 5 + 32).toInt().toString()+"F"
        }
        
        "F" -> {
            ((number - 32) * 5 / 9).toInt().toString()+"C"
        }
        
        else -> "Temperature Invalid "
    }
    return (result)
}

fun main() {
    val temperature = "-90C" // Tests = -30C && 50f && -100c && 20a
    println("Assume that")
    println("¤ temperature is $temperature")
    println("Then")
    println("¤ result is " + task9(temperature))
}

