package com.match.date;
import java.util.*;  

class Matcher {
    private ArrayList<User> users;


    /**
     * @brief constructo for Matcher object
     */
    public Matcher() {
        this.users = new ArrayList<User>();
    }

    /**
     * @brief checks if a match has been made
     * @param requester userID of requesting user
     * @param responder userId of responding user
     * @return True if match, False otherwise
     */
    static boolean isMatch(String requester, String responder) {
        return true;
    }

    /**
     * @brief assigns a request if isMatch returns False
     * @param userIDResponder userID of user the request was made to
     * @return True if assignment was successfull, False if not
     */
    static boolean assignRequest(String userIDResponder){
        return true;
    }

    /**
     * @brief creates a request, checking isMatch and calls assignRequest if isMatch returns false
     * @param userIDRequester userID of requester
     * @param userIDResponder userID of responder
     * @param connection to server
     * @return True of match was made, False otherwise
     */
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

    /**
     * @brief shows profiles to a user based on their preferences
     * @param preferences arraylist of users preferences
     * @return list of users to swipe on 
     */
    public ArrayList<User> showProfilesOnPreferences(ArrayList<String> preferences) {
        return this.users; 
    }

}