package Strings.Level3;

// Class to calculate frequency of each character in a string
public class CharFrequency {

    // Method to find frequency of characters and return as a 2D string array
    static String[][] frequency(String s) {
        // Array to store frequency of ASCII characters
        int[] freq = new int[256];

        // Loop to count frequency of each character
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        // 2D array to store character and its frequency
        String[][] result = new String[s.length()][2];
        int index = 0;

        // Loop to store each character and its frequency only once
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0; // Mark as processed
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Get frequency of characters in the string "banana"
        String[][] res = frequency("banana");

        // Print character frequencies
        for (String[] r : res)
            if (r[0] != null)
                System.out.println(r[0] + " : " + r[1]);
    }
}
