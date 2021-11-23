package com.match.date;
import java.util.*;  

class Subscription {
    private ArrayList<String> tiers;

    
    public Subscription(ArrayList<String> tiers) {
        this.tiers = tiers; 
    }

    
    public boolean verifySubscription() {
        return true; 
    }

    public boolean editSubscription() {
        return true; 
    }

    public int getPrice(ArrayList<String> tiers) {
        return 1;
    }
}
