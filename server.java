package com.match.date;
import java.util.*;  

class Server {

    private ArrayList<String> listOfUsers;
    private ArrayList<String> listOfProfiles;

    public Server() {
        this.listOfUsers = new ArrayList<String>();
        this.listOfProfiles = new ArrayList<String>();
    }

    public ArrayList<String> sendProfileOnPreferences() {
        return this.listOfProfiles;
    }

    public boolean storeUser() {
        return true;
    }

    public boolean updateUser() {
        return true; 
    }
}



