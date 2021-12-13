package com.match.date;
import java.util.*;  

class Subscription {
    private Tier tier;

    /**
     * @brief constructor for Subscription object
     */
    public Subscription() {
        this.tier = Tier.None; 
    }

    
    /**
     * @brief verifies a users subscription
     * @return True if verification was succesfull, False otherwise
     */
    public boolean verifySubscription() {
        return true; 
    }

    /**
     * @brief edits the users subscription
     * @param newTier the new subscription Tier the user has chosen
     * @return The selected Tier if the update was successfull, the previously saved Tier otherwise
     */
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

    /**
     * @brief fetches the price for a selected Tier
     * @param Tier the Tier to fetch the price for
     * @return price of selected Tier
     */
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
