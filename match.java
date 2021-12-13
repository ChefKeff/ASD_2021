package com.match.date;
import java.util.*;  

class Match {
    private User requester;
    private User responder;
    private FeedbackAndBlock fb;

    /**
     * @brief constructor for Match object
     * @param requester User object with requester User
     * @param repsonder User object with responder User
     */
    public Match(User requester, User responder) {
        this.requester = requester;
        this.responder = responder; 
        this.fb = new FeedbackAndBlock(requester, responder);

    }   

    /** 
     * @brief allows a user to write feedback about their match
     * @return string with feedback
     */
    public String writeFeedback() {
        return "";
    }

    /**
     * @brief allows a user to block another user
     * @return returns True if successfull 
     */
    public boolean blockUser() {
        return true; 
    }

    /**
     * @brief pseudo code representing the blocking process
     * @param um connection to UserMatches
     */
    public void blockSequence(UserMatches um) {
        int heuristic = fb.submitBlock();
        if(um.updateHeuristic(heuristic)) {
            um.removeMatch();
        } 
    }
}