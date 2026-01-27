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
// Base Product class
        abstract class Product {
            double price;
            abstract String getCategory();
        }

// Product types
        class Book extends Product {
            Book(double price) {
                this.price = price;
            }

            String getCategory() {
                return "Book";
            }
        }

        class Clothing extends Product {
            Clothing(double price) {
                this.price = price;
            }

            String getCategory() {
                return "Clothing";
            }
        }

        class Gadget extends Product {
            Gadget(double price) {
                this.price = price;
            }

            String getCategory() {
                return "Gadget";
            }
        }

// Discount utility
        class DiscountUtil {
            static <T extends Product> void applyDiscount(T product, double percent) {
                product.price -= product.price * percent / 100;
                System.out.println(product.getCategory() + " price after discount: " + product.price);
            }
        }

// Main Program
        public class DynamicOnlineMarketplace {
            public static void main(String[] args) {
                Book book = new Book(500);
                Clothing cloth = new Clothing(1000);

                DiscountUtil.applyDiscount(book, 10);
                DiscountUtil.applyDiscount(cloth, 20);
            }
        }

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
