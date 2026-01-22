package classandobjects.level1;

/**
 * The MobilePhone class represents a mobile phone with brand, model, and price.
 * It provides functionality to display the phone's details.
 */
public class MobilePhone {
    String brand;
    String model;
    double price;

    // Method to display the mobile phone's details
    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.brand = "Samsung";
        phone.model = "S21";
        phone.price = 70000;

        phone.displayDetails();
    }
}
