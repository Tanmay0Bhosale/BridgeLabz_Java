package classandobjects.level1;

/**
 * The Item class represents an item with code, name, and price.
 * It provides methods to display item details and calculate total cost based on quantity.
 */
public class Item {
    int itemCode;
    String itemName;
    double price;

    // Method to display the item's details
    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

    // Method to calculate and display the total cost for a given quantity
    void calculateTotalCost(int quantity) {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.itemCode = 201;
        item.itemName = "Pen";
        item.price = 10;

        item.displayItem();
        item.calculateTotalCost(5);
    }
}
