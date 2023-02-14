package lms_127

fun task9(sentence: String, character: Char): Boolean {

    return sentence.contains(character, ignoreCase = true)
}

fun main (){
    val sentence = "I code in KOTLIN"
    val character = 'I'
    println("Assume that")
    println("¤ sentence is $sentence")
    println("¤ character is $character")
    println("Then")
    println("¤ result is " +task9(sentence, character))
}