package ConstructorsAndInstances.Level1;

// Circle class represents a geometric circle
public class Circle {

    // Instance variable to store the radius of the circle
    double radius;

    // Default constructor
    // This constructor is called when no radius is provided
    // It uses constructor chaining to call the parameterized constructor
    public Circle() {
        this(1.0); // Calls the parameterized constructor with default radius 1.0
    }

    // Parameterized constructor
    // This constructor initializes the circle with a user-defined radius
    public Circle(double radius) {
        this.radius = radius; // Assigns the given radius to the instance variable
    }

    // Method to calculate the area of the circle
    // Formula used: π × r²
    public double area() {
        return Math.PI * radius * radius;
    }
}
