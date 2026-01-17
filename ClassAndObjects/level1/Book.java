package ClassAndObjects.level1;

/**
 * The Book class represents a book with basic attributes such as title, author, and price.
 * It provides functionality to display the details of the book.
 */
public class Book {
    String title;
    String author;
    double price;

    // Method to display the book's details
    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java Basics";
        book.author = "James";
        book.price = 399;

        book.displayDetails();
    }
}
