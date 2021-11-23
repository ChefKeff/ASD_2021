package com.match.date;
import java.util.*;  

class Matcher {
    private ArrayList<String> users;
    
    public Matcher() {
        this.users = new ArrayList<String>();
    }

    public boolean createRequest() {
        return true;
    }

    public boolean createResponse() {
        return true; 
    }

    public ArrayList<String> showProfilesOnPreferences() {
        return this.users; 
    }

}