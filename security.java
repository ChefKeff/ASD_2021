package com.match.date;
import java.util.*;  

class Security {
    

    static boolean verifyLogin(User currentUser) {
        long length = UtilFunctions.lengthNumber(currentUser.getSSN());
        if(length == 10 || length == 12){
            return true;
        } else {
            return false; 
        }
        
    }

    public User signUp(long ssn, String name, int age) {
        User newUser = new User("a123kfas901kasdj12", ssn, name, age);
        return newUser; 
    }
}