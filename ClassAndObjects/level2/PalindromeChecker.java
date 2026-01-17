package oopsprogrammingfundamentals.level2;

public class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equals(reverse);
    }

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
