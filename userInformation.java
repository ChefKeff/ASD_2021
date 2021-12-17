package com.match.date;
import java.util.*;  

class UserInformation {
    private User currentUser; 
    private Server server; 

    /**
     * @brief constructor for UserInformation object
     * @param User connection to the User
     * @param server connection to the server  
     */
    public UserInformation(User currentUser, Server server) {
        this.currentUser = currentUser;
        this.server = server; 
    }
    /**
     * @brief checks if the User is equal to the one saved in the Server abd updates if not
     * @return True if update was successfull, False otherwise 
     */
    public boolean isUpdated() {
        return this.server.updateUser(this.currentUser);
    }
}



