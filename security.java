package com.match.date;
import java.util.*;  

class Security {
    

    static boolean verifyLogin(User currentUser) {
        int length = UtilFunctions.lengthNumber(currentUser.getSSN());
        if(length == 10 || length == 12){
            return true;
        } else {
            return false; 
        }
        
    }

    public User signUp(int ssn) {
        User newUser = new User("a123kfas901kasdj12", ssn, "Alfred", 23);
        return newUser; 
    }
}