package lms_127

fun task5(valueForA: Int, valueForB: Int): Pair<Int, Int> {

    var a = valueForA
    var b = valueForB
        println("Assume that")
        println("¤ a is $a ")
        println("¤ b is $b")

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
        println("Assume that")
        println("¤ a is $a ")
        println("¤ b is $b")

    val temporary = a
    a = b
    b = temporary
        println("Then after the swap")
        println("¤ a is $a ")
        println("¤ b is $b")
    return Pair(a, b)
    */
}
fun main(){
    task5(1,2)
}