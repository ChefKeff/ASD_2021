package com.match.date;
import java.util.*;  

class Chat {
    private ArrayList<String> chattingUsers;
    private int metaData; 
    private ArrayList<String> currentChat;

    /**
     * @brief constructor for the chat class
     * @param chattingUsers userIDs of the two chatting users
     */
    public Chat(ArrayList<String> chattingUsers) {
        this.chattingUsers = chattingUsers;
        this.metaData = 0;
        this.currentChat = new ArrayList<String>();
    }

    /**
     * @brief method for handling sent and recieved messages
     * @return current chat as an arraylist of strings 
     */
    public ArrayList<String> handleMessage() {
        return this.currentChat; 
    }
} 