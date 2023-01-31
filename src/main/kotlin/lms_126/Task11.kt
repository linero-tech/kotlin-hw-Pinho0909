package lms_126

fun task11(): String {

    return """
         INPUT temperature (limit with 3 characters)
            IF third characters = C THEN
            First and Second characters convert to = c
                f = 1.8 * c + 32
                OUTPUT f
            ELSE
            First and Second characters convert to = f
            c = ( f - 32 ) * 0.5556
            OUTPUT c
    """

}
