package com.match.date;
import java.util.*;  

class Subscription {
    private Tier tier;

    
    public Subscription() {
        this.tier = Tier.None; 
    }

    
    public boolean verifySubscription() {
        return true; 
    }

    public Tier editSubscription(Tier newTier) {
        if(newTier != this.tier){
            PaymentMethod pm = new PaymentMethod(getPrice(newTier));
            if(pm.sendBill()){
                this.tier = newTier;
            } 
        } else {
            System.out.print("You alreade have this tier");
        }
        return this.tier;
         
    }

    public int getPrice(Tier tier) {
        switch(tier) {
            case None:
                return 0;
            case Bronze:
                return 100;
            case Silver:
                return 200;
            case Gold:
                return 300;
            case Max:
                return 400;
        }
        return 0; 
    }
    
}
