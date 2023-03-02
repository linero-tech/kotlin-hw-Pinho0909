package lms_129

fun task4(): Int {
    var result = 0
    for (i in 1..1000) {
        if (i % 9 == 0) {
            result += i
        }
    }
    return result
}

fun main() {
    
    println(task4())
}