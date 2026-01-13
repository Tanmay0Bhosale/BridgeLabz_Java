package Strings;

public class NullPointerDemo {

    static void generateException() {
        String text = null;
        text.length(); // Exception
    }

    static void handleException() {
        try {
            String text = null;
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    public static void main(String[] args) {
        // generateException(); // Uncomment to see crash
        handleException();
    }
}

