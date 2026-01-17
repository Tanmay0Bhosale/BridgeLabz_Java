package ConstructorsAndInstances.Level1;

// LibraryBook class represents a book in a library system
public class LibraryBook {

    // Instance variable to store book title
    String title;

    // Instance variable to store author name
    String author;

    // Instance variable to store book price
    double price;

    // Instance variable to track availability of the book
    // true means available, false means already borrowed
    boolean available;

    // Parameterized constructor
    // Initializes the book details and marks the book as available
    public LibraryBook(String title, String author, double price) {
        this.title = title;       // Assign book title
        this.author = author;     // Assign author name
        this.price = price;       // Assign price
        this.available = true;    // Book is available by default
    }

    // Method to borrow a book
    // Checks availability before allowing borrowing
    public void borrowBook() {

        // If book is available, allow borrowing
        if (available) {
            available = false;    // Mark book as borrowed
            System.out.println("Book borrowed successfully.");
        }
        // If book is already borrowed
        else {
            System.out.println("Book is not available.");
        }
    }

    // Method to display book details
    // Shows the title and availability status
    public void display() {
        System.out.println(title + " | Available: " + available);
    }

    // Static nested Person class
    // Demonstrates the use of a copy constructor
    public static class Person {

        // Instance variable to store person's name
        String name;

        // Instance variable to store person's age
        int age;

        // Parameterized constructor
        // Initializes a Person object with given name and age
        public Person(String name, int age) {
            this.name = name;   // Assign name
            this.age = age;     // Assign age
        }

        // Copy constructor
        // Creates a new Person object by copying another Person's data
        public Person(Person other) {
            this.name = other.name; // Copy name from existing object
            this.age = other.age;   // Copy age from existing object
        }

        // Method to display person details
        public void display() {
            System.out.println(name + " | Age: " + age);
        }
    }
}
