package com.match.date;
import java.util.*;  

class FeedbackAndBlock {
    private User senderOfFeedback;
    private User recieverOfFeedback; 

    public FeedbackAndBlock(User senderOfFeedback, User recieverOfFeedback) {
        this.senderOfFeedback = senderOfFeedback;
        this.recieverOfFeedback = recieverOfFeedback; 
    }

    public int submitBlock() {
       return -100;
    } 
}