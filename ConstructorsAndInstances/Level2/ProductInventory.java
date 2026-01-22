package constructorsandinstances.Level2;

/**
 * The ProductInventory class represents a product with name and price, and tracks total products created using a static variable.
 * It demonstrates instance and static methods.
 */
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

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: INR " + price);
    }

    // Class method to display total products created
    public static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}
