package lms_126

fun task8(): String {

    return """
        INPUT x
            If x is multiple of 3 THEN
                If x is multiple of 5 THEN 
                    OUTPUT FooBar             
                ELSE         
                    OUTPUT Foo
            ELSE
                If x is not multiple of 5 THEN
                    OUTPUT Qix
                ELSE
                    OUTPUT Bar
    """
}