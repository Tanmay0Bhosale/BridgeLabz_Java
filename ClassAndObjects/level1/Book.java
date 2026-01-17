package oopsprogrammingfundamentals.level1;

public class Book {
    String title;
    String author;
    double price;

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
