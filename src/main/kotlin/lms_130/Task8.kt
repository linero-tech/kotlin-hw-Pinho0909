package lms_130

fun task8(items: List<Int>): List<Int> {
    
    //Option 2
    val result = items.distinct().sortedDescending().subList(0, 3).reversed()
    println(result.toList())
    
    //My Solution
    val highestList = items.sortedDescending()
    val highestValues = mutableSetOf<Int>()
    
    for (index in 2 downTo   0) {
        highestValues.add(highestList[index])
    }
    return highestValues.toList()
}

fun main() {
    val myList = listOf(60, 9, 7, 10)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}