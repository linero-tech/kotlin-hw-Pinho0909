package lms_129

fun task3(number: Int): Int {
    var result = 1
    for (i in number downTo 1){
    //Opcion 2   for (i in 1..number) {
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