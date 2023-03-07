package lms_129

//import java.util.regex.Pattern

fun task10(password: String): Boolean {
    
    return (password.length in 6..10) &&
            (password.firstOrNull { it.isLowerCase() } != null) &&
            (password.firstOrNull { it.isUpperCase() } != null) &&
            (password.firstOrNull { it.isDigit() } != null) &&
            (password.contains('$') || password.contains('#') || password.contains('@'))
}
/*
////Code with RegEx
        Link :  https://zetcode.com/kotlin/regularexpressions/
                https://www.w3schools.com/jsref/jsref_obj_regexp.asp
                https://desarrollowp.com/blog/tutoriales/buscando-patron-con-expresiones-regulares/
*/

///Refactoring with Regex
fun regex(password: String): Boolean {
    
    //val condition = ("(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[@$#]){6,10}")
    //val pattern = Pattern.compile(condition)
    //val result = pattern.matcher(password)
    //return result.find()
    
    //val condition = ("(?=.+\\w)(?=.+\\W){6,10}").toRegex()
    val condition = ("(?=.+[a-z])(?=.+[A-Z])(?=.+[0-9])(?=.+[@$#]){6,10}").toRegex()
    return condition.containsMatchIn(password)
}

fun main() {
    
    val password = "A1A@@gus"
    if (task10(password)) {
        println("A password is valid")
    } else {
        println("A password is not valid")
    }
    println("Regex is " + regex(password))
}
