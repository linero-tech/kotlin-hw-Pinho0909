package lms_127

fun task10_1(assessments: String): Int {

    return assessments.length
}
fun task10_2(assessments: String): Char {

    return assessments[3]
}
fun task10_3(assessments: String): Char {
    val result = assessments.length/2
    return assessments[result]
}

fun task10_4(assessments: String): String {

    return assessments.substring(0,3)
}
fun main(){
    val assessments1 = "LMHHF"
    val assessments2 = "LMFHMF"
    val assessments3 = "LMFHM"
    println("¤ Assume that Assessment is")
    println("¤ Task10_1 $assessments1 then result is " + task10_1(assessments1))
    println("¤ Task10_2 $assessments2 then result is " + task10_2(assessments2))
    println("¤ Task10_3 $assessments3 then result is " + task10_3(assessments3))
    println("¤ Task10_4 $assessments3 then result is " + task10_4(assessments3))
}