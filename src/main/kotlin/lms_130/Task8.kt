package lms_130

fun task8(items: List<Int>): List<Int> {
    
    //Option 2
    val highestList = items.sortedDescending()
    val highestValues = mutableSetOf<Int>()
    
    for (index in 0..2) {
        highestValues.add(highestList[index])
    }
    println("Option 2 is " + highestValues.reversed())
    
    //My Solution
    val result = items.sortedDescending().subList(0, 3).reversed()
    return (result.toSet().toList())
}

fun main() {
    val myList = listOf(60, 9, 7, 10)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}