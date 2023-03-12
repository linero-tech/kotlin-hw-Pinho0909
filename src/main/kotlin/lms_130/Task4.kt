package lms_130

fun task4(items: List<Int>, factor: Int): List<Int> {
    
    val listFactor = mutableListOf<Int>()
    items.forEach { number ->
        if ( number % factor == 0) {
            listFactor.add(number)
        }
    }
    return listFactor.toSet().toList()
}

fun main () {
    val myList = listOf(1, 2, 4, 5, 6)
    val factor = 2
    println("¤ items is $myList")
    println("¤ factor is $factor")
    println("Then")
    println("¤ result is " + task4(myList, factor))
}
