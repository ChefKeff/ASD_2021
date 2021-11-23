package com.match.date;
import java.util.*;  

class Chat {
    private ArrayList<String> chattingUsers;
    private int metaData; 
    private ArrayList<String> currentChat;

    public Chat(ArrayList<String> chattingUsers) {
        this.chattingUsers = chattingUsers;
        this.metaData = 0;
        this.currentChat = new ArrayList<String>();
    }

    public ArrayList<String> handleMessage() {
        return this.currentChat; 
    }
} 