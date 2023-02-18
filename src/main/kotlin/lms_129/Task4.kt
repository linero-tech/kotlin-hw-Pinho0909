package lms_129

fun task4(a:Int,b:Int): Int {
    var result = 0
    for (i in a..b) {
        if (i % 9 == 0) {
            result += i
        }
    }
    return result
}
fun main (){
    println("First Number=")
    val a = readln().toInt()
    println("Second Number=")
    val b = readln().toInt()
    println (task4(a,b))
}