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

    public boolean storeUser(User user) {
        this.listOfUsers.add(user);
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

    public void signUpProcess(Security sec) {
        long ssn = 190409208546L;
        String name = "Göran Persson";
        int age = 117;
        User newUser = sec.signUp(ssn, name, age);
        storeUser(newUser); 
    }

}



