package lms_127

fun task8(sentence: String, character: Char): Int {

    return sentence.count { it == character }

}
fun main (){
    val sentence = "I code in KOTLIN"
    val character = 'I'
    println("Assume that")
    println("¤ sentence is $sentence")
    println("¤ character is $character")
    println("Then")
    println("¤ result is " +task8(sentence, character))
}