package com.match.date;
import java.util.*;  

class UserMatches {

    private ArrayList<String> requests;
    private ArrayList<Match> matches;
    private ArrayList<String> leftSwipes;
    private int userHeuristic; 

    /**
     * @brief constructor for UserMatches object
     */
    public UserMatches() {
        this.requests = new ArrayList<String>();
        this.matches = new ArrayList<Match>();
        this.leftSwipes = new ArrayList<String>();
        this.userHeuristic = 0;
    }

    /**
     * @brief updates a users userHeuristic
     * @param modifier value to update the heuristic with
     * @return True if update was successfull, False otherwise
     */
    public boolean updateHeuristic(int modifier) {
        this.userHeuristic = this.userHeuristic + modifier; 
        return true;
    }

    /**
     * @brief removes a match
     */
    public void removeMatch() {
        //Remove match
    }

    /**
     * @brief creates a new match 
     * @param u1 one of the users that matched
     * @param u2 the other user that matched
     * @return True if creation was successfull, False otherwise 
     */
    public boolean createMatch(User u1, User u2) {
        Match newMatch = new Match(u1, u2);
        matches.add(newMatch);
        return true;
    }

    /**
     * @brief saves a request to a user if a match wasnt made
     * @param userID id of the user that requested the match
     * @return True if successfull, False otherwise 
     */
    public boolean saveRequest(String userID) {
        requests.add(userID); 
        return true;
    }


}