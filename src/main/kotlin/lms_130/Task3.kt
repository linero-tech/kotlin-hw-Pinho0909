package lms_130

fun task3(items: List<Int>): List<Int> {
    
    /*
    1.Code using count() function and distinct
            
            return (items.distinct().filter { x -> items.count { it == x } > 1 }.toSet()).toList()
        
    2.Code using groupingBy() function
        A better solution is to create a frequency map and filter out values
        that have a count of more than.
        
            return items.groupingBy { it }.eachCount().filter { it.value > 1 }.keys.toList()
        
        Alternatively, we can use the to get a map containing all key-value pairs with "values"
        that match the given predicate.filterValues()
        
            return items.groupingBy { it }.eachCount().filterValues { it > 1 }.keys.toList()
        
        A less efficient solution is to use the function, which directly groups items from
        the original collection.groupingBy() groupBy ()
        
            return items.groupBy { it }.filter { it.value.size > 1 }.keys.toList()
    
    3. Code using a Set check elements that are repeated any index
        
        val listSet = mutableSetOf<Int>()
        return items.filter { !listSet.add(it) }.toSet().toList()
      
    */
    
    val repeatedList = mutableListOf<Int>()
    val uniqueList = mutableListOf<Int>()
    
    items.forEach { number ->
        if (number in uniqueList) {
            repeatedList.add(number)
        } else {
            uniqueList.add(number)
        }
    }
    return repeatedList.toSet().toList()
}

fun main() {
    val myList = listOf(1, 1, 1, 2, 2, 3)
    println("¤ items is $myList")
    println("Then")
    println("¤ result is " + task3(myList))
}