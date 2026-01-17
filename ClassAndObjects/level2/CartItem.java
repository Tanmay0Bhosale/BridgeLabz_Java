package ClassAndObjects.level2;

/**
 * The CartItem class represents an item in a shopping cart with name, price, and quantity.
 * It provides methods to add or remove quantities and display the total cost.
 */
public class CartItem {
    String itemName;
    double price;
    int quantity;

    // Method to add a specified quantity to the item
    void addItem(int qty) {
        quantity += qty;
    }

    // Method to remove a specified quantity from the item
    void removeItem(int qty) {
        quantity -= qty;
    }

    // Method to display the total cost based on price and quantity
    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem item = new CartItem();
        item.itemName = "Book";
        item.price = 300;

        item.addItem(2);
        item.removeItem(1);
        item.displayTotalCost();
    }
}
