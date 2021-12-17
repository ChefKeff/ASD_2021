package com.match.date;
import java.util.*;  
import java.awt.Image;

class Profile {

    private String bio;
    private ArrayList<Image> pictures; 
    private int age; 
    private ArrayList<String> preferences;
    private String name; 


    /**
     * @brief constructor for Profile object
     * @param name the users name
     * @param age the users age
     */
    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
        this.bio = "";
        this.pictures = new ArrayList<Image>();
        this.preferences = new ArrayList<String>();
    }
    

    /**
     * @brief fetches users preferences
     * @return arraylist with preferences
     */
    public ArrayList<String> getPreferences() {
        return this.preferences;
    }

    /**
     * @brief edits the users bio
     * @param newBio string to replace bio with
     * @return True if bio was appropriate, False otherwise
     */
    public boolean editBio(String newBio) {
        if(!VerifyProfle.isTextInapt()){
            this.bio = newBio;
            return true;
        }
        return false;
    }
    /**
     * @brief edits the users pictures
     * @param newPictures the users new pictures
     * @return True if pictures were appropriate, False otherwise
     */
    public boolean editPictures(ArrayList<Image> newPictures) {
        if(VerifyProfle.isDickPick()){
            this.pictures = newPictures;
            return true;
        }
        return false;
    }

}


