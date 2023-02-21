package lms_129
import kotlin.math.roundToInt
fun task9(temperature: String): String {
    val num = temperature.dropLast(1).toInt()
    val temp = temperature.last().uppercase()

    val result = if (temp == "C") {
        (((1.8 * num + 32) * 100.0).roundToInt() /100).toString()+"F"
    }
    else ((((num - 32) * 0.5556) * 100.0).roundToInt() /100).toString()+"C"
    return (result)
}
fun main (){
    val temperature= "15c"
    println("Assume that")
    println("¤ temperature is $temperature")
    println("Then")
    println("¤ result is " + task9(temperature))
}

