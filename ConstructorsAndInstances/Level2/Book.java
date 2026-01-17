package ConstructorsAndInstances.Level2;

/**
 * The Book class represents a book with ISBN, title, and author, demonstrating access modifiers.
 * It includes getter and setter for private author field, and a subclass EBook for inheritance.
 */
public class Book {

    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Getter for private author field
    public String getAuthor() {
        return author;
    }

    // Setter for private author field
    public void setAuthor(String author) {
        this.author = author;
    }
}

// Subclass in SAME file
class EBook extends Book {

    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }

    // Method to display accessible book details
    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title);
    }
}
