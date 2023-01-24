package lms_126

fun task4(): String {

    return """
        INPUT X
        INPUT Y
            IF X > Y THEN
        OUTPUT "X"
            ELSE
            IF Y > X THEN
        OUTPUT "Y"
            ElSE
        OUTPUT "X" "=" "Y"
    """.trimIndent()
}
