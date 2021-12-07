package com.match.date;
import java.util.*;  
import java.awt.Image;

class User {
    private String userID;
    private int ssn; 
    private Profile profile;
    private Subscription subscription;
    private UserMatches userMatches; 



    public User(String userID, int ssn, String name, int age) {
        this.userID = userID;
        this.ssn = ssn;
        this.profile = new Profile(name, age); 
        this.subscription = new Subscription();
        this.userMatches = new UserMatches(); 
    }

    public boolean logIn() {
        return true; 
    }

    public boolean deleteUser() {
        return true;
    }

    public Profile getProfileInfo() {
        return this.profile;
    } 

    public ArrayList<String> getPreferences() {
        return this.profile.getPreferences();
    }

    public int getSSN() {
        return this.ssn; 
    }

    public String getID() {
        return this.userID; 
    }

    public void matchProccess(Matcher matcher, Server server) {
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

    public boolean subscriptionProcess() {
        Tier returnTier = this.subscription.editSubscription(Tier.Bronze);
        if(Tier.Bronze == returnTier) {
            if(this.subscription.verifySubscription()) {
                return true;
            }
        }
        return false;
         
    }

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