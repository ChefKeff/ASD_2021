package com.match.date;
import java.util.*;  

class PaymentMethod {
    private int price; 
    
    /**
     * @brief constructor for PaymentMethod object
     * @param price price of selected subscription
     */
    public PaymentMethod(int price) {
        this.price = price;
    }

    /**
     * @brief sends the bill to the user
     * @return True if successfull, False otherwise
     */
    public boolean sendBill() {
        return true; 
    }

}