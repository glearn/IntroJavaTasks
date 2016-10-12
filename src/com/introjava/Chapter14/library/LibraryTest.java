package com.introjava.Chapter14.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryTest {
    public static void main(String[] args) throws InterruptedException {
        List<Book> books = new ArrayList<Book>() {{
            add(new Book("book1", "Steven King", "pub1", 2000, 154898));
            add(new Book("book2", "Steven King", "pub1", 2000, 164898));
            add(new Book("book3", "Steven King", "pub1", 2000, 174898));
            add(new Book("book4", "Author1", "pub1", 2000, 184898));
            add(new Book("book5", "Author2", "pub1", 2000, 194898));
        }};

        Library library = new Library("Library1", books);

        for (int i = 0; i < books.size(); i++) {
            library.printBookInfoByIndex(i);
        }

        List<Book> results = library.findBooksByAuthor("Steven King");

        System.out.println();
        System.out.println(results);

        for (Book book : results) {
            library.deleteBookByISBN(book.ISBN);
        }

        System.out.println();

        books = library.getBooks();

        for (Book book : books) {
            System.out.println(book);
        }
        ;
    }
}
