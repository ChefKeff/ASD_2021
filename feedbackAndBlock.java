package com.match.date;
import java.util.*;  

class FeedbackAndBlock {
    private User senderOfFeedback;
    private User recieverOfFeedback; 


    /**
     * @brief constructor for FeedbackAndBlock object
     * @param senderOfFeedback User object of the user sending the feedback
     * @param recieverOfFeedback User object of the user recieving the feedback
     */
    public FeedbackAndBlock(User senderOfFeedback, User recieverOfFeedback) {
        this.senderOfFeedback = senderOfFeedback;
        this.recieverOfFeedback = recieverOfFeedback; 
    }

    /**
     * @brief submits the requested block and calculates heuristic modifier
     * @return int with heuristic modifier 
     */
    public int submitBlock() {
       return -100;
    } 
}