package lms_129

fun task1(a: Int, b: Int): Int {
    var result = 0
    if (a >= b ) {
        return 0
    } else
        {
            for (i in a..b)
                result += i
        }
        return result
}
fun main (){

    val a = 3
    val b = 3
    println("Assume that")
    println("¤ a is $a")
    println("¤ b is $b")
    println("Then")
    println("¤ result is " + task1(a,b))
}