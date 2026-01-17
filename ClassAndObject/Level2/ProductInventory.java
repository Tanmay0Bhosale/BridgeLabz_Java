package ConstructorsAndInstances.Level2;


public class ProductInventory {

    // Instance variables
    String productName;
    double price;

    // Class variable
    static int totalProducts = 0;

    public ProductInventory(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: INR " + price);
    }

    // Class method
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
