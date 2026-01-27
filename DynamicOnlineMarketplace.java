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
