package com.example.alistair.booklistingapp;

import java.net.URL;

public class Book {

    // Create variables for the book info constructor

    // Title of the book
    private String mTitle;

    // Author of the book
    private String mAuthor;

    // Image of the book ( url )
    private URL mImage;

    // Url to book webpage
    private String mUrl;

    // Create constructor accepting variables above
    public Book(String title, String author, URL image) {
        mTitle = title;
        mAuthor = author;
        mImage = image;
    }

    // Make getter methods for those variables
    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public URL getImage() {
        return mImage;
    }

}








