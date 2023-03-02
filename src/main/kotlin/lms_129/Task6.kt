package lms_129

fun task6(number: Int): Int {
    var num = number
    var result = 0
    while (num != 0) {
        /*First loop
        Divisible for 10 a safe in val ( rest of 678 = 8)
        Result = 0 * 10 + rest = 8
        for new loop number divide by 10 (678 = 67)
        */
        val rest = num % 10
        result = result * 10 + rest
        num /= 10
    }
    return result
}

fun main() {
    val number = 678
    println("Assume that")
    println("¤ number is $number")
    println("Then")
    println("¤ result is " + task6(number))
}
