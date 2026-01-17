package Strings.Level3;

// Class to check whether two strings are anagrams
public class AnagramCheck {

    // Method to check if two strings are anagrams
    static boolean isAnagram(String a, String b) {

        // If lengths differ, they cannot be anagrams
        if (a.length() != b.length()) return false;

        // Frequency array to count characters
        int[] freq = new int[256];

        // Increment for characters in first string
        // Decrement for characters in second string
        for (int i = 0; i < a.length(); i++) {
            freq[a.charAt(i)]++;
            freq[b.charAt(i)]--;
        }

        // Check if all frequencies are zero
        for (int i : freq)
            if (i != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        // Test the anagram check
        System.out.println(isAnagram("listen", "silent"));
    }
}
