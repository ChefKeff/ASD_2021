package com.match.date;
import java.util.*;  

class CreditCard {
    private String cardHolderName;
    private int cardNumber; 
    private int cvc; 

    public CreditCard(String cardHolderName, int cardNumber, int cvc) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.cvc = cvc; 
    }
}