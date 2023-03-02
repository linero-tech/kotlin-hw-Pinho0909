package lms_129

fun task7(a: Int, b: Int): Int {
    var result = 1
    var exp = b
    while (exp != 0) {
        result *= a
        --exp
    }
    return result
}

fun main() {
    val a = 2
    val b = 3
    println("Assume that")
    println("¤ a is $a")
    println("¤ b is $b")
    println("Then")
    println("¤ result is " + task7(a, b))
}