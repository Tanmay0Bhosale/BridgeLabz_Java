package ConstructorsAndInstances.Level1;

// CarRental class represents a car rental booking
public class CarRental {

    // Instance variable to store the customer's name
    String customerName;

    // Instance variable to store the rented car model
    String carModel;

    // Instance variable to store number of rental days
    int rentalDays;

    // Instance variable to store fixed cost per day for rental
    // This value is same for all objects unless changed
    double costPerDay = 1500;

    // Parameterized constructor
    // This constructor initializes rental details for a customer
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;  // Assign customer name
        this.carModel = carModel;          // Assign car model
        this.rentalDays = rentalDays;      // Assign rental duration
    }

    // Method to calculate total rental cost
    // Total cost is calculated by multiplying rental days with cost per day
    public double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    // Method to display rental details
    // Calls calculateTotalCost() to show final payable amount
    public void display() {
        System.out.println(customerName + " | " + carModel +
                " | Days: " + rentalDays +
                " | Total Cost: INR " + calculateTotalCost());
    }
}
