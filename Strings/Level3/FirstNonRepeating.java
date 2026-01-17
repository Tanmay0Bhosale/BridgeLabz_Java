package Strings.Level3;

// Class to find the first non-repeating character in a string
public class FirstNonRepeating {

    // Method to find the first character that appears only once
    static char findFirstNonRepeat(String s) {
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++)
            if (freq[s.charAt(i)] == 1)
                return s.charAt(i);

        // Return null character if no non-repeating character exists
        return '\0';
    }

    public static void main(String[] args) {
        // Test string
        String text = "swiss";

        // Print first non-repeating character
        System.out.println(findFirstNonRepeat(text));
    }
}
