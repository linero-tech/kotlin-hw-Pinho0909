package lms_129

fun task8(number: Int): Int {
    var num = number
    var result = 0
    while (num != 0) {
        val rest = num % 10
        result += rest
        num /= 10
    }
return  result
}

fun main (){
    val number= 123
    println("Assume that")
    println("¤ number is $number")
    println("Then")
    println("¤ result is " + task8(number))
}