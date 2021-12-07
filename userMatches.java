package com.match.date;
import java.util.*;  

class UserMatches {

    private ArrayList<String> requests;
    private ArrayList<Match> matches;
    private ArrayList<String> leftSwipes;
    private int userHeuristic; 

    public UserMatches() {
        this.requests = new ArrayList<String>();
        this.matches = new ArrayList<Match>();
        this.leftSwipes = new ArrayList<String>();
        this.userHeuristic = 0;
    }

    public boolean updateHeuristic(int modifier) {
        this.userHeuristic = this.userHeuristic + modifier; 
        return true;
    }

    public void removeMatch() {
        //Remove match
    }


}