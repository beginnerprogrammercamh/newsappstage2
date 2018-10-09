package com.example.android.travelnews;

//Set up News class
public class News {

    private String mTitle;
    private String mSection;
    private String mDate;
    private String mUrl;

    //Sets up the inputs for the News class
    public News(String title, String section, String date, String url) {
        mTitle = title;
        mSection = section;
        mDate = date;
        mUrl = url;
    }

    //Define the get() methods
    public String getTitle() {
        return mTitle;
    }

    public String getSection() {
        return mSection;
    }

    public String getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }
}

