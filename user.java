package com.match.date;
import java.util.*;  

class User {
    private String userID;
    private ArrayList<String> requests; 
    private ArrayList<String> matches; 
    private ArrayList<String> leftSwipes; 
    private int ssn; 
    private int userHeuristic; 



    public User(String userID, int ssn) {
        this.userID = userID;
        this.requests = new ArrayList<String>();
        this.matches = new ArrayList<String>();
        this.leftSwipes = new ArrayList<String>();
        this.ssn = ssn;
        this.userHeuristic = 0; 
    }

    public boolean logIn() {
        return true; 
    }

    public boolean deleteUser() {
        return true;
    }

    public ArrayList<String> getProfileInfo() {
        return this.matches;
    } 

    public ArrayList<String> getPreferences() {
        return this.matches;
    }


}