package lms_126

fun task5(): String {

    return """
        START
        FOR x = 1 to 8
        IF x = 8 THEN
            OUTPUT "Day not found"
            END          
        ELSE
            x = x - 1
            day = ARRAY ("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
            OUTPUT "day"
    """.trimIndent()
}
