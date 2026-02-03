import java.util.*;

// Base abstract class
abstract class WarehouseItem {
    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void getDetails();
}

// Item types
class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }

    void getDetails() {
        System.out.println("Electronics: " + name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }

    void getDetails() {
        System.out.println("Groceries: " + name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }

    void getDetails() {
        System.out.println("Furniture: " + name);
    }
}

// Generic Storage class
class Storage<T extends WarehouseItem> {
    T item;

    void store(T item) {
        this.item = item;
    }

    T retrieve() {
        return item;
    }
}

// Main Program
public class SmartWarehouseManagementSystem {
    public static void main(String[] args) {
        Storage<Electronics> eStore = new Storage<>();
        eStore.store(new Electronics("Laptop"));
        
        Storage<Groceries> gStore = new Storage<>();
        gStore.store(new Groceries("Rice"));

        List<WarehouseItem> items = new ArrayList<>();
        items.add(eStore.retrieve());
        items.add(gStore.retrieve());

        for (WarehouseItem item : items) {
            item.getDetails();
        }
    }
}
