package lms_129

fun task10(password: String): Boolean {
    
    return (password.length in 6..10) &&
            (password.firstOrNull { it.isLowerCase() } != null) &&
            (password.firstOrNull { it.isUpperCase() } != null) &&
            (password.firstOrNull { it.isDigit() } != null) &&
            (password.contains('$') || password.contains('#') || password.contains('@'))
}
/*
////Code with RegEx
        
        [0]         Search one character
        [02]        Search character 0 and 2
        [0-9]       Search character between 1 and 9
        [$@#]       Search character $ or @ or #
        [0][0]      Search all characters together -> example 00
        [0]{2}      Search two occurrences of character or pattern. {2} = occurrences
        [0-9]{6}    Search number of occurrences of the pattern in the first numbers
        [0-9]{6}$   Search number of occurrences of the pattern in the last numbers
        ^[0-9]{6}$  Search number of occurrences of the pattern from the beginning to the end
        
        Example of a date.
        [0-9]{4}[-][0-9]{2}[-][0-9]{2}
        If I want to change, use() for example
        ([0-9]{4})[-]([0-9]{2})[-]([0-9]{2})
            $1 / $2 / $3
        Link :  https://zetcode.com/kotlin/regularexpressions/
                https://www.w3schools.com/jsref/jsref_obj_regexp.asp
*/

///Refactoring with Regex
fun regex(password: String): Boolean {
    val condition = ("""[a-z][A-Z][0-9][$@#]""").toRegex()
    return (condition.containsMatchIn(password)) &&
            (password.length in 6..10)
}

fun main() {
    val password = "A1a@#gus"
    if (task10(password)) {
        println("A password is valid")
    } else {
        println("A password is not valid")
    }
    println("Regex is " + regex(password))
}
