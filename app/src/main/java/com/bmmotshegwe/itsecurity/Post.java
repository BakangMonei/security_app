package com.bmmotshegwe.itsecurity;

import com.google.gson.annotations.SerializedName;

public class Post {
    private  int userID, id;
    private String title;

    @SerializedName("body")
    private String text;

    // Getters
    public int getUserID() {
        return userID;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getText() {
        return text;
    }
}
