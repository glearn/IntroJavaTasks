package com.introjava.Chapter14.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        List<Book> found = new ArrayList<Book>();

        for (Book book : books) {
            if (book.author.equals(author)) {
                found.add(book);
            }
        }

        return found;
    }

    public void printBookInfoByIndex(int index) {
        System.out.println(books.get(index));
    }

    public void deleteBookByISBN(int isbn) {
        for (Book book : books) {
            if (book.ISBN == isbn) {
                books.remove(book);
                return;
            }
        }
    }

    public List<Book> getBooks() {
        return books;
    }
}
