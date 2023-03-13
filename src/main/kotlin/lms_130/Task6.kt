package lms_130

fun task6(sentence: String): String {
    var newSentence = ""
    sentence.forEachIndexed { index, letter ->
        if (index % 2 == 0) {
            newSentence += letter.uppercase()
        } else {
            newSentence += letter
        }
    }
    return newSentence
}

fun main () {
    val sentence = "I like Gothenburg"
    println("¤ sentence is $sentence")
    println("Then")
    println("¤ result is " + task6(sentence))
}