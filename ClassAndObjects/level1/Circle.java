package classandobjects.level1;

/**
 * The Circle class represents a circle with a given radius.
 * It provides methods to calculate and display the area and circumference of the circle.
 */
public class Circle {
    double radius;

    // Method to calculate and display the area of the circle
    void calculateArea() {
        System.out.println("Area: " + (Math.PI * radius * radius));
    }

    // Method to calculate and display the circumference of the circle
    void calculateCircumference() {
        System.out.println("Circumference: " + (2 * Math.PI * radius));
    }

    public static void main(String[] args) {
        Circle c = new Circle();
        c.radius = 5;

        c.calculateArea();
        c.calculateCircumference();
    }
}
