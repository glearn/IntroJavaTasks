package com.introjava.Chapter14.library;

public class Book {
    public String title;
    public String author;
    public String publisher;
    public Integer year;
    public Integer ISBN;

    public Book(String title, String author, String publisher, Integer year, Integer ISBN) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", year=" + year +
                ", ISBN=" + ISBN +
                '}';
    }
}
