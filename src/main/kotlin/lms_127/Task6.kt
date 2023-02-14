package lms_127

fun task6(base1: Double, base2: Double, height: Double): Double {

    return (base1 + base2) * 0.5 * height
}
fun main (){
    val base1 =10.0
    val base2 =20.0
    val height =1.0
    println("Assume that")
    println("¤ base1 is $base1")
    println("¤ base2 is $base2")
    println("¤ height is $height")
    println("Then")
    println("¤ result is " +task6(base1,base2,height))

}