package lms_129

fun task5(sentence: String): Int {
    var result = 0
    //for (i  in 0 until sentence.length)
    for (i in sentence.indices) {
        result += 1
    }
    return result
}

fun main() {
    val sentence = "I love GBG"
    println("Assume that")
    println("¤ sentence is $sentence")
    println("Then")
    println("¤ result is " + task5(sentence))
}