package lms_129

fun task10(password: String): Boolean {

/*
//Length Min = 6 characters and Max = 10 characters.
    val length = password.length in 6..10
    println("length $length")

//At least 1 letter between [a-z] and At least 1 letter between [A-Z]
    val lower = password.firstOrNull { it.isLowerCase() } != null
    println("lower $lower")

//At least 1 letter between [A-Z]
    val upper = password.firstOrNull { it.isUpperCase() } != null
    println("upper $upper")

//Number between [0-9].
    val digit = password.firstOrNull { it.isDigit() } != null
    println("digit $digit")

//Number between [$#@].
    val character =
        password.contains('$') || password.contains('#') || password.contains('@')
    println("character $character")

return length && lower && upper && digit && character
 */

    return  (password.length in 6..10)                    &&
            (password.firstOrNull { it.isLowerCase() } != null) &&
            (password.firstOrNull { it.isUpperCase() } != null) &&
            (password.firstOrNull { it.isDigit() } != null)     &&
         //Refactoring later
    (password.contains('$') || password.contains('#') || password.contains('@'))

// Regex
//val result = (password.contains(^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$ ))
//println(result)
//return result
}
fun main () {
    val password = "aA1$12"
    println("Result is " + task10(password)) // true
    val length = "aA1$"
    println("Length " + task10(length)) // false
    val lowerCase = "AA1$12"
    println("lowerCase " + task10(lowerCase)) // false
    val upperCase = "aa1$12"
    println("upperCase " + task10(upperCase)) // false
    val digit = "aAA@aa"
    println("digit " + task10(digit)) // false
    val character = "aA1$"
    println("character " + task10(character)) // false

/*
    if (task10(password) == true ){
        println ("A password is valid")
    } else {
        println ("A password is not valid")
    }
 */
}