package com.match.date;
import java.util.*;  

class Security {
    

    /**
     * @brief verifies the user during login
     * @param currentUser user to verify
     * @return True if login was successfull, False otherwise
     */
    static boolean verifyLogin(User currentUser) {
        long length = UtilFunctions.lengthNumber(currentUser.getSSN());
        if(length == 10 || length == 12){
            return true;
        } else {
            return false; 
        }
        
    }


    /**
     * @brief creates a new User
     * @param ssn users social sequrity number
     * @param name users name
     * @param age users age
     */
    public User signUp(long ssn, String name, int age) {
        User newUser = new User("a123kfas901kasdj12", ssn, name, age);
        return newUser; 
    }
}