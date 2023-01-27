package lms_126

fun task11(): String {

    return """
         START
         INPUT temperature (limit with 3 characters)
         READ temperature characters
            IF third characters = C THEN
            READ temperature characters
            First and Second characters convert to integral number = c
                f = 1.8 * c + 32
                OUTPUT f
                END
            ELSE
            READ temperature characters
            First and Second characters convert to integral number = f
            c = ( f - 32 ) * 0.5556
            OUTPUT c
            END
    """.trimIndent()

}
