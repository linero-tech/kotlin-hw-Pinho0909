package lms_130


fun task7(items: List<Int>): Int {
    
    var minValue = 0
    
    if (items.isNotEmpty()) {
        minValue = items.first()
        items.forEach { number ->
            if (number < minValue) {
                minValue = number
            }
        }
    }
    
    return minValue
}
///Option 2 = return items.sorted()[0]

fun main() {
    val myList = listOf<Int>()
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task7(myList))
}