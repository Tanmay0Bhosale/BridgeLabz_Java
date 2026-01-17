package oopsprogrammingfundamentals.level1;

public class Item {
    int itemCode;
    String itemName;
    double price;

    void displayItem() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }

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
