package ConstructorsAndInstances.Level1;

// Book class represents a simple book entity
public class Book {

    // Instance variable to store the title of the book
    String title;

    // Instance variable to store the author name
    String author;

    // Instance variable to store the price of the book
    double price;

    // Default constructor
    // This constructor is called when no arguments are passed
    // It initializes the book with default values
    public Book() {
        title = "Unknown";     // Assign default title
        author = "Unknown";    // Assign default author
        price = 0.0;           // Assign default price
    }

    // Parameterized constructor
    // This constructor is used to initialize the book with user-provided values
    // 'this' keyword refers to the current object instance
    public Book(String title, String author, double price) {
        this.title = title;    // Assign passed title to instance variable
        this.author = author;  // Assign passed author to instance variable
        this.price = price;    // Assign passed price to instance variable
    }

    // Instance method to display book details
    // This method prints the title, author, and price of the book
    public void display() {
        System.out.println(title + " | " + author + " | INR " + price);
    }
}
