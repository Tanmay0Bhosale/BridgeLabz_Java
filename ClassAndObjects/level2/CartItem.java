package oopsprogrammingfundamentals.level2;

public class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        quantity -= qty;
    }

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
