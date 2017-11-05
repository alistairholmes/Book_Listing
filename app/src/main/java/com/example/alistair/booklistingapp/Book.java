package com.example.alistair.booklistingapp;

import java.net.URL;

public class Book {

    // Create variables for the book info constructor

    // Title of the book
    private String mTitle;

    // Author of the book
    private String mAuthor;

    // Url to book webpage
    private String mUrl;

    // Create constructor accepting variables above
    public Book(String title, String author) {
        mTitle = title;
        mAuthor = author;
    }

    // Make getter methods for those variables
    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }


}








