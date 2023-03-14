package lms_130

fun task8(items: List<Int>): List<Int> {
    
    //Option 2
    val highestList = items.toSet().sortedDescending()
    val highestValues = mutableSetOf<Int>()
    
    for (index in 0..2) {
        highestValues.add(highestList[index])
    }
    println("Option 2 is " + highestValues.reversed())
    
    //My Solution
    val result = items.toSet().sortedDescending().subList(0, 3).reversed()
    return (result.toList())
}

fun main() {
    val myList = listOf(4, 3, 2, 1, 4, 3, 2, 1)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task8(myList))
}