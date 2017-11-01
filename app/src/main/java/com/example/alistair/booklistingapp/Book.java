package com.example.alistair.booklistingapp;

public class Book {

    // Create variables for the book info constructor

    // Title of the book
    private String mTitle;

    // Author of the book
    private String mAuthor;

    // Image of the book ( url )
    private String mImage;

    // Url to book webpage
    private String mUrl;

    // Create constructor accepting variables above
    public Book(String title, String author, String image) {
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

    public String getImage() {
        return mImage;
    }

}








