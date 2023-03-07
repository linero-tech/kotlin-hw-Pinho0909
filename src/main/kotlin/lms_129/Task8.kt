package lms_129

fun task8(number: Int): Int {
    
    /* Solution Class
    var result = 0
    number.toString().forEach { digit ->
        result += digit.digitToInt()
        
        //for (digit in number.toString()) {
        //    result += digit.digitToInt()
    }
     */
    
    var num = number
    var result = 0
    while (num != 0) {
        val rest = num % 10
        result += rest
        num /= 10
    }
    return result
}

fun main() {
    val number = 123
    println("Assume that")
    println("¤ number is $number")
    println("Then")
    println("¤ result is " + task8(number))
}