package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {

    var a = valueForA
    var b = valueForB

    a -= b
    b += a
    a = b - a
        println("Then after the swap")
        println("¤ a is $a ")
        println("¤ b is $b")
    return Pair(a, b)
/*
Option 2
    var a = valueForA
    var b = valueForB

    val temporary = a     = b     = temporary
        println("Then after the swap")
        println("¤ a is $a ")
        println("¤ b is $b")
    return Pair(a, b)
*/
}
fun main(){
    val a = 1
    val b = 2
    println("Assume that")
    println("¤ a is $a ")
    println("¤ b is $b")
    task5(a,b)
}