package com.wsexample.demows;

public class Book {
    private String title;
    private String publisher;
    private Author author;


    public Book(String title, String publisher, Author author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
    
}
