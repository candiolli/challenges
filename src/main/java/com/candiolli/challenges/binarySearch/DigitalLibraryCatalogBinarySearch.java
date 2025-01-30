package com.candiolli.challenges.binarySearch;

public class DigitalLibraryCatalogBinarySearch {


    public static void main(String[] args) {
        new DigitalLibraryCatalogBinarySearch().process();
    }

    private void process() {
        LibraryCatalog catalog = new LibraryCatalog(1000);

        // Adding some sample books
        catalog.addBook(new Book("9780451524935", "1984", "George Orwell"));
        catalog.addBook(new Book("9780061120084", "To Kill a Mockingbird", "Harper Lee"));
        catalog.addBook(new Book("9780141439518", "Pride and Prejudice", "Jane Austen"));
        catalog.addBook(new Book("9780743273565", "The Great Gatsby", "F. Scott Fitzgerald"));

        // Searching for a book
        String searchISBN = "9780451524935";
        Book foundBook = catalog.findBookByISBN(searchISBN);

        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book not found with ISBN: " + searchISBN);
        }
    }

}

