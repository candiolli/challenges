package com.candiolli.challenges.binarySearch;

public class LibraryCatalog {

    private Book[] books;
    private int size;

    public LibraryCatalog(int capacity) {
        this.books = new Book[capacity];
        this.size = 0;
    }

    // Add a book and maintain sorted order by ISBN
    public void addBook(Book book) {
        if (size >= books.length) {
            System.out.println("Catalog is full");
            return;
        }

        // Insert book in sorted position
        int i = size - 1;
        while (i >= 0 && books[i].compareTo(book) > 0) {
            books[i + 1] = books[i];
            i--;
        }
        books[i + 1] = book;
        size++;
    }

    // Binary search implementation to find book by ISBN
    public Book findBookByISBN(String isbn) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books[mid].getIsbn().compareTo(isbn);

            if (comparison == 0) {
                return books[mid];
            }

            if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

}
