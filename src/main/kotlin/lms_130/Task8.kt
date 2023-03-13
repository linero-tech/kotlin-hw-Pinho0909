package lms_130

fun task8(items: List<Int>): List<Int> {
    
    val  highestValue = items.sortedDescending().subList(0, 3).reversed()
    return highestValue.toSet().toList()
}

fun main() {
    val myList = listOf(1, 1, 1, 1)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}