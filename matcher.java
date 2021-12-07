package com.match.date;
import java.util.*;  

class Matcher {
    private ArrayList<User> users;
    
    public Matcher() {
        this.users = new ArrayList<User>();
    }

    static boolean isMatch(String requester, String responder) {
        return true;
    }

    static boolean assignRequest(String userIDResponder){
        return true;
    }

    static boolean createRequest(String userIDRequester, String userIDResponder, Server server) {
        // Check if response or request
        if(isMatch(userIDRequester, userIDResponder)){
            User requester = server.getUserOnID(userIDRequester);
            User responder = server.getUserOnID(userIDResponder);
            Match newMatch = new Match(requester, responder);
            return true;
        } else {
            boolean request = assignRequest(userIDResponder);
            return false;  
        }
        
    }

    public boolean createResponse() {
        return true; 
    }

    public ArrayList<User> showProfilesOnPreferences(ArrayList<String> preferences) {
        return this.users; 
    }

}