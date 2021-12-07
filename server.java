package com.match.date;
import java.util.*;  

class Server {

    private ArrayList<User> listOfUsers;

    public Server() {
        this.listOfUsers = new ArrayList<User>();
    }

    public ArrayList<User> sendUserOnPreferences() {
        return this.listOfUsers;
    }

    public boolean storeUser() {
        return true;
    }

    public boolean updateUser(User currentUser) {
        return true; 
    }
    
    public User getUserOnID(String userID) {
        for(int i = 0; i < this.listOfUsers.size(); i++) {
            User currentUser = listOfUsers.get(i);  
            if(userID == currentUser.getID()) {
                return currentUser; 
            }
        }
        return null;
    }

}



