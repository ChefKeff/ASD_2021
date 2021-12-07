package com.match.date;
import java.util.*;  

class UserInformation {
    private User currentUser; 
    private Server server; 

    public UserInformation(User currentUser, Server server) {
        this.currentUser = currentUser;
        this.server = server; 
    }

    public boolean isUpdated() {
        return this.server.updateUser(this.currentUser);
    }
}



