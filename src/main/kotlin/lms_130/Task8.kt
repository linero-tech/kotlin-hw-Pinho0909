package lms_130

fun task8(items: List<Int>): List<Int> {
    
    //Option 2
    val result = items.sortedDescending().subList(0, 3).reversed()
    println(result)
    
    //My Solution
    val highestList = items.sortedDescending().toMutableList()
    
    for (index in 3 until highestList.size) {
        highestList.removeAt(index)
    }
    return highestList.reversed()
}

fun main() {
    val myList = listOf(60, 9, 7, 10)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}