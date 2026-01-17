package Strings.Level3;

// Class to check whether a string is a palindrome using different logics
public class PalindromeCheck {

    // Logic 1: Check palindrome using two-pointer approach
    static boolean logic1(String s) {
        int i = 0, j = s.length() - 1;

        // Compare characters from start and end
        while (i < j)
            if (s.charAt(i++) != s.charAt(j--))
                return false;

        return true;
    }

    // Logic 2: Check palindrome using recursion
    static boolean logic2(String s, int i, int j) {
        // Base case: all characters checked
        if (i >= j) return true;

        // If characters do not match
        if (s.charAt(i) != s.charAt(j)) return false;

        // Recursive call for inner substring
        return logic2(s, i + 1, j - 1);
    }

    // Logic 3: Check palindrome by reversing the string
    static boolean logic3(String s) {
        char[] orig = s.toCharArray();
        char[] rev = new char[orig.length];

        // Create reversed character array
        for (int i = 0; i < orig.length; i++)
            rev[i] = s.charAt(orig.length - 1 - i);

        // Compare original and reversed arrays
        for (int i = 0; i < orig.length; i++)
            if (orig[i] != rev[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        // Test string
        String s = "madam";

        // Check palindrome using different logics
        System.out.println(logic1(s));
        System.out.println(logic2(s, 0, s.length() - 1));
        System.out.println(logic3(s));
    }
}
