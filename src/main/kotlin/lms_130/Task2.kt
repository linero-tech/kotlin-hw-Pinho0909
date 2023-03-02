package lms_130

fun task2(items: List<Int>): Int {
    var result = 0
    
    for (index in items.indices) {
        if (index % 2 == 0) {
            result += items[index]
        }
    }
    return result
}

fun main() {
    val myList = listOf(1, 2, 3, 4)
    println("Assume that")
    println("¤ number is $myList")
    println("Then")
    println("¤ result is " + task2(myList))
    
}