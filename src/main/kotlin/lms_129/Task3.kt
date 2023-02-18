package lms_129

fun task3(number: Int): Int {
    var result = number
    //Opcion 2 for (i in 1 until  result)
        for (i in result-1 downTo 1) {
            result*= i
        }
    return result
}
fun main (){
    val number = 5
    println("Assume that")
    println("¤ number a is $number ")
    println("Then")
    println("¤ result is " + task3(number))
}