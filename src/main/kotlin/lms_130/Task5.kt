package lms_130

fun task5(items: List<Int>): List<Int> {
    
    val list = mutableListOf<Int>()
    items.forEachIndexed { index, number ->
         val result = number.times(index)
            list.add(result)
        }
    return list
}

fun main () {
    val myList = listOf(1, 5, 11)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task5(myList))
}
