package lms_127

// What this is Import?
import kotlin.math.roundToInt
//import java.math.RoundingMode
//import java.math.BigDecimal
//import java.text.DecimalFormat


fun task3(radius: Double): Double {
    val pi = 3.1416
    val result = radius * 2 * pi
    return (result * 100.0).roundToInt() / 100.0
}
fun main (){
    val radius = 2.0
    println ("Assume that")
    println("¤ Radius is $radius")
    println("Then")
    println("¤ result is " +task3(radius))
}

/*
///Option 2///
    Is working, but we need to change task3: BigDecimal
    return BigDecimal(result).setScale(2, RoundingMode.UP)

///Option 3///
    Is not working?
    val df = DecimalFormat("#.##")
    df.roundingMode = RoundingMode.UP
    return df.format(result)

///Option 4///
    Is not working?
    return String.format("%.2f",result).toDouble
*/