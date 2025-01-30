package com.candiolli.challenges.binarySearch;

public class Book implements Comparable<Book> {

    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    // Implementing Comparable to ensure books can be sorted by ISBN
    @Override
    public int compareTo(Book other) {
        return this.isbn.compareTo(other.isbn);
    }

    @Override
    public String toString() {
        return String.format("ISBN: %s, Title: %s, Author: %s", isbn, title, author);
    }

    public String getIsbn() {
        return isbn;
    }

}
