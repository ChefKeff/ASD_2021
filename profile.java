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

    public String editBio() {
        return this.bio;
    }

    public ArrayList<Image> editPictures() {
        return this.pictures;
    }

}


