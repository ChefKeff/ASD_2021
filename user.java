package com.match.date;
import java.util.*;  
import java.awt.Image;

class User {
    private String userID;
    private long ssn; 
    private Profile profile;
    private Subscription subscription;
    private UserMatches userMatches; 


    /** 
     * @brief the constructor for the User class
     * @param userID ID of the user
     * @param ssn The users social sequrity number
     * @param profile the users profile (what is seen by other users)
     * @param subscription the users current subscription (None if none exists)
     * @param userMatches the users current matches and requests
    */ 
    public User(String userID, long ssn, String name, int age) {
        this.userID = userID;
        this.ssn = ssn;
        this.profile = new Profile(name, age); 
        this.subscription = new Subscription();
        this.userMatches = new UserMatches(); 
    }

    /**
     * @brief logs in the user
     * @return True if login was successfull, False otherwise. 
    */
    public boolean logIn() {
        return true; 
    }

    /**
     * @brief deletes the current User along with its profile and matches
     * @return True if deletion was successfull, False otherwise
    */
    public boolean deleteUser() {
        return true;
    }

    /** 
     * @brief fetches the Users Profile info to be shown to other users
     * @return the Profile stored in the User
    */
    public Profile getProfileInfo() {
        return this.profile;
    } 

    /**
     * @brief fetches the users preferences from the Profile
       @return An arraylist of the users preferences 
     */
    public ArrayList<String> getPreferences() {
        return this.profile.getPreferences();
    }

    /**
     * @brief returns the Users social sequrity number
     * @return long with social sequrity number
     */
    public long getSSN() {
        return this.ssn; 
    }

    /**
     * @brief returns the Users ID
     * @return String with userID
     */
    public String getID() {
        return this.userID; 
    }

    /**
     * @brief pseudo code representing the matching process
     * @param matcher connection to the matcher
     * @param server connection to the server 
     */
    public void matchProcess(Matcher matcher, Server server) {
        //Seudo code representing the process for swiping  and matching
        ArrayList<String> preferences = this.getPreferences();
        ArrayList<User> users = matcher.showProfilesOnPreferences(preferences);
        User currentUser = users.get(0);
        boolean match = matcher.createRequest(this.userID, currentUser.getID(), server);
        if(match) {
            userMatches.createMatch(this, currentUser);
        } else {
            userMatches.saveRequest(currentUser.userID); 
        }

    }

    /**
     * @brief pseudo code representing the subscirption process
     * @return True if subscription change was successfull, False if not. 
     */
    public boolean subscriptionProcess() {
        Tier returnTier = this.subscription.editSubscription(Tier.Bronze);
        if(Tier.Bronze == returnTier) {
            if(this.subscription.verifySubscription()) {
                return true;
            }
        }
        return false;
         
    }

    /**
     * @brief pseudo code representing the profile updating process
     * @param images the images to update with
     * @param server connection to the server
     */
    public boolean updateProfileProcess(ArrayList<Image> images, Server server) {
        if(this.profile.editBio("Test") && this.profile.editPictures(images)){
            UserInformation userInfo = new UserInformation(this, server);
            if(userInfo.isUpdated()) {
                return true;
            }
        }
        return false;
    }


}