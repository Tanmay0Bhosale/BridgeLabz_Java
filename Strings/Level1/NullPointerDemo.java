package Strings.Level1;

public class NullPointerDemo {

    // This method generateException is used to demonstrate generating a NullPointerException
    static void generateException() {
        String text = null; // Set text to null
        text.length(); // Attempt to call length() on null, which throws NullPointerException
    }

    // This method handleException is used to demonstrate handling a NullPointerException using try-catch
    static void handleException() {
        try { // Try block to attempt risky operation
            String text = null; // Set text to null
            text.length(); // Call length() which will throw NullPointerException
        } catch (NullPointerException e) { // Catch block to handle the NullPointerException
            System.out.println("NullPointerException handled"); // Print message when exception is caught
        }
    }

    // This method main is used to execute the program and call the exception handling method
    public static void main(String[] args) {
        // generateException(); // Uncomment to see crash - this would cause the program to terminate with unhandled exception
        handleException(); // Call handleException to demonstrate proper exception handling
    }
}

