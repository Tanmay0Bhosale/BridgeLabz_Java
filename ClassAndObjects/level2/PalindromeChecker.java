package classandobjects.level2;

/**
 * The PalindromeChecker class checks if a given text is a palindrome.
 * It provides methods to check for palindrome and display the result.
 */
public class PalindromeChecker {
    String text;

    // Method to check if the text is a palindrome by comparing with its reverse
    boolean isPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equals(reverse);
    }

    // Method to display whether the text is a palindrome or not
    void displayResult() {
        if (isPalindrome())
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "madam";

        p.displayResult();
    }
}
