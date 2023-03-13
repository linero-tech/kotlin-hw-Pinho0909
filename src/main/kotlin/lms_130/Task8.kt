package lms_130

fun task8(items: List<Int>): List<Int> {
    
    val highestValue = items.toSet().sortedDescending().subList(0, 3).reversed()
    return highestValue
}

fun main() {
    val myList = listOf(60, 9, 7, 10,)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}