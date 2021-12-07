package com.match.date;
import java.util.*;  
import java.awt.Image;

class Profile {

    private String bio;
    private ArrayList<Image> pictures; 
    private int age; 
    private ArrayList<String> preferences;
    private String name; 

    public Profile(String name, int age) {
        this.name = name;
        this.age = age;
        this.bio = "";
        this.pictures = new ArrayList<Image>();
        this.preferences = new ArrayList<String>();
    }
    

    public ArrayList<String> getPreferences() {
        return this.preferences;
    }

    public boolean editBio(String newBio) {
        if(!VerifyProfle.isTextInapt()){
            this.bio = newBio;
            return true;
        }
        return false;
    }
    public boolean editPictures(ArrayList<Image> newPictures) {
        if(VerifyProfle.isDickPick()){
            this.pictures = newPictures;
            return true;
        }
        return false;
    }

}


