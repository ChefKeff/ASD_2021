package com.match.date;
import java.util.*;  

class Match {
    private User requester;
    private User responder;
    private FeedbackAndBlock fb;


    public Match(User requester, User responder) {
        this.requester = requester;
        this.responder = responder; 
        this.fb = new FeedbackAndBlock(requester, responder);

    }   


    public boolean assignRequest() {
        return true;
    }

    public String writeFeedback() {
        return "";
    }

    public boolean blockUser() {
        return true; 
    }

    public void blockSequence(UserMatches um) {
        int heuristic = fb.submitBlock();
        if(um.updateHeuristic(heuristic)) {
            um.removeMatch();
        } 
    }
}