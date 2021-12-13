package com.match.date;
import java.util.*;  

class Server {

    private ArrayList<User> listOfUsers;

    /**
     * @brief constructor for Server object
     */
    public Server() {
        this.listOfUsers = new ArrayList<User>();
    }

    /** 
     * @brief returns users from server based on some preferences
     * @return list of users
     */
    public ArrayList<User> sendUserOnPreferences() {
        return this.listOfUsers;
    }

    /**
     * @brief Stores a User object in the server
     * @param User user to store
     * @return True if successfull, False otherwise
     */
    public boolean storeUser(User user) {
        this.listOfUsers.add(user);
        return true;
    }

    /** 
     * @brief updates a user in the server
     * @param currentUser user to update
     * @return True if update was successfull, False otherwise
     */
    public boolean updateUser(User currentUser) {
        return true; 
    }
    

    /**
     * @brief fetches user from server based on userID
     * @param userID ID of user to fetch
     * @return User object with matching ID
     */
    public User getUserOnID(String userID) {
        for(int i = 0; i < this.listOfUsers.size(); i++) {
            User currentUser = listOfUsers.get(i);  
            if(userID == currentUser.getID()) {
                return currentUser; 
            }
        }
        return null;
    }

    /**
     * @brief pseudo code representing the sign up process
     * @param sec connection to security 
     */
    public void signUpProcess(Security sec) {
        long ssn = 190409208546L;
        String name = "Göran Persson";
        int age = 117;
        User newUser = sec.signUp(ssn, name, age);
        storeUser(newUser); 
    }

}



