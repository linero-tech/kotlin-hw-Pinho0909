package lms_126

fun task10(): String {

    return """
         START
         OUTPUT "Write your new account with your email address"
         INPUT email
         OUTPUT "Write your Passwords with 6 characters "
         INPUT pass (limit with 6 characters)
         OUTPUT "Write your Passwords again "
         INPUT pass2 (limit with 6 characters)
            IF pass different pass 2 THEN
                OUTPUT "The Passwords are not the same.Try Create you account again, Thanks "
                END    
            ELSE  
            INPUT email
            INPUT pass
            OUTPUT "You created your account with success"
            END
    """.trimIndent()
}
