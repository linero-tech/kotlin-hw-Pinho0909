package lms_127


fun task4(base: Double, height: Double): Double {
    return (base * height) / 2
}
fun main (){
    val b = 5.0
    val h = 10.0
    println ("Assume that")
    println("¤ base is $b")
    println("¤ height is $h")
    println("Then")
    println("¤ result is " +task4(b, h))
}