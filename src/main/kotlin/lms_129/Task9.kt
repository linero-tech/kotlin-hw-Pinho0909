package lms_129

import kotlin.math.roundToInt

fun task9(temperature: String): String {
    
    /*
        val temp: String
        val number: Int
        
        when (temperature.length) {
            4 -> {
                temp = temperature[3].toString().uppercase()
                number = temperature.substringBefore(temp).toInt()
                println(temp)
                println(number)
            }
            
            3 -> {
                temp = temperature[2].toString().uppercase()
                number = temperature.substringBefore(temp).toInt()
                println(temp)
                println(number)
            }
            
            else -> println("temperature Invalid")
        }
    }
    */
    val number = temperature.dropLast(1).toInt()

    val result = when (temperature.last().toString().uppercase()) {
        "C" -> {
            (((1.8 * number + 32) * 100.0).roundToInt() /100).toString()+"F"
        }
        
        "F" -> {
            ((((number - 32) * 0.5556) * 100.0).roundToInt() /100).toString()+"C"
        }
        
        else -> "Temperature Invalid "
    }
    return (result)
}

fun main() {
    val temperature = "-90F" // Tests = -30C && 50f && -100c && 20a
    println("Assume that")
    println("¤ temperature is $temperature")
    println("Then")
    println("¤ result is " + task9(temperature))
}

