package lms_126

fun task4(): String {

    return """
        START
        INPUT x
        INPUT y
        IF x = y THEN
            OUTPUT "x = y"
            END
        ELSE IF x > y THEN
            OUTPUT "x"
            END
        ELSE 
            OUTPUT "y"
            END
    """.trimIndent()
}
