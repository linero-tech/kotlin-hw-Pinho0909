package lms_126

fun task9(): String {

    return """
        OUTPUT "Hello Insert your Card"
        IF acceptable card THEN
            OUTPUT "Write your Password"
            INPUT password   
            IF password is correct THEN
                OUTPUT "Write the Amount to Withdraw"
                INPUT amount 
                    IF amount < Account Balance THEN
                        OUTPUT "Operation is Canceled and Take your Card"   
                    ELSE IF amount > limit THEN         
                        OUTPUT "Maximum Amount is limit and Take your Card"   
                    ELSE
                    OUTPUT "Do you want Receipt 
                    INPUT x
                        IF x = yes THEN
                            OUTPUT "Take your Amount, Card and Receipt"    
                        ELSE
                            OUTPUT "Take your Amount and Card"
            ELSE   
            OUTPUT "Password Incorrect and Take your Card"         
        ELSE
        OUTPUT "It is not Acceptable Card and Take your Card"
    """
}
