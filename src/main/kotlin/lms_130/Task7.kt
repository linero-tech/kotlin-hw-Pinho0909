package lms_130

import kotlin.math.min

fun task7(items: List<Int>): Int {
    
    var minValue = 0
    var count = 0
    
    while (count < items.size - 1) {
        minValue = if (items[count] < items[count + 1]) {
            items[count]
        } else {
            items[count + 1]
        }
        count += 1
    }
    return minValue
}

fun main() {
    val myList = listOf(10, 5, 11)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task7(myList))
}