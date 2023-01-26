package lms_126

fun task8(): String {

    return """
        INPUT X
            If X is multiple of 3 THEN 
                If X is multiple of 5 THEN 
                    OUTPUT "FooBar"
                ELSE         
                    OUTPUT "Foo"
            ELSE
                If X is not multiple of 5 THEN
                    OUTPUT "Qix"
                ELSE
                    OUTPUT "Bar"
    """.trimIndent()
}