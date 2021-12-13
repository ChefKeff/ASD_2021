package com.match.date;
import java.util.*;  

class CreditCard {
    private String cardHolderName;
    private int cardNumber; 
    private int cvc; 

    /**
     * @brief construcotr for CreditCard object
     * @param cardHolderName Name of card holder
     * @param cardnumber int with the number of the credit card
     * @param cvc int with cards cvc number
     */
    public CreditCard(String cardHolderName, int cardNumber, int cvc) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvc = cvc; 
    }
}