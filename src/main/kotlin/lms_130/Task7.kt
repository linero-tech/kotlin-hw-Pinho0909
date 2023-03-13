package lms_130

import kotlin.math.min

fun task7(items: List<Int>): Int {
    
    var minValue = items.first()
    
    items.forEach { number ->
        if (number < minValue) {
            minValue = number
        }
    }
    return minValue
}
    ///Option 2 = return items.sorted()[0]

fun main() {
    val myList = listOf(-1, 0, 1, 2, 3, 4, 5, -9, -10, 0, 100)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task7(myList))
}