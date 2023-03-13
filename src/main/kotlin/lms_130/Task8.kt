package lms_130

fun task8(items: List<Int>): List<Int> {
    
    return items.toSet().sortedDescending().subList(0, 3).reversed()
}

fun main() {
    val myList = listOf(1, 2, 3, 4, 1, 2, 3, 4)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}