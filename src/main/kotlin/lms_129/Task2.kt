package lms_129

fun task2(number: Int): Boolean {

    if (number < 2) {
        return false
    }
    for (i in 2 until number) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}
fun main (){
    val number = 5
    println("Assume that")
    println("¤ number is $number")
    println("Then")
    println("¤ result is " + task2(number))

}