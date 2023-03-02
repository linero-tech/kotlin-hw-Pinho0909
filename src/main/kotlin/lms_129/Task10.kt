package lms_129

fun task10(password: String): Boolean {
    
    /* First Code
    
    1. Length Min = 6 characters and Max = 10 characters.
        val length = password.length in 6..10
        println("length $length")
    
    2. At least 1 letter between [a-z] and At least 1 letter between [A-Z]
        val lower = password.firstOrNull { it.isLowerCase() } != null
        println("lower $lower")
    
    3. At least 1 letter between [A-Z]
        val upper = password.firstOrNull { it.isUpperCase() } != null
        println("upper $upper")
    
    4. Number between [0-9].
        val digit = password.firstOrNull { it.isDigit() } != null
        println("digit $digit")
    
    5. Number between [$#@].
        val character =
            password.contains('$') || password.contains('#') || password.contains('@')
        println("character $character")
    
    return length && lower && upper && digit && character
    
    ///Refactoring with firstOrNull
        return  (password.length in 6..10)                          &&
                (password.firstOrNull { it.isLowerCase() } != null) &&
                (password.firstOrNull { it.isUpperCase() } != null) &&
                (password.firstOrNull { it.isDigit() } != null)     &&
        (password.contains('$') || password.contains('#') || password.contains('@'))
        
    */
    
    /* Explain RegEx
    
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
    
    val condition = ("""[a-z][A-Z][0-9][$@#]""").toRegex()
    return (condition.containsMatchIn(password)) &&
            (password.length in 6..10)
}

fun main() {
    
    val lengthMin = "aA1$"
    println("LengthMin " + task10(lengthMin)) // false
    val lengthMax = "aA1$123456789"
    println("LengthMax " + task10(lengthMax)) // false
    val lowerCase = "AA1$12"
    println("lowerCase " + task10(lowerCase)) // false
    val upperCase = "aa1$12"
    println("upperCase " + task10(upperCase)) // false
    val digit = "aAA@aa"
    println("digit " + task10(digit)) // false
    val character = "aA11aa"
    println("character " + task10(character)) // false
    
    val password = "aA1@aaaa"
    if (task10(password)) {
        println("A password is valid")
    } else {
        println("A password is not valid")
    }
    
}