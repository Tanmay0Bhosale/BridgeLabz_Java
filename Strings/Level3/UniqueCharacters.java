package Strings.Level3;

// Class to find unique characters in a string
public class UniqueCharacters {

    // Method to find length of string without using length()
    static int findLength(String s) {
        int count = 0;
        try {
            // Keep accessing characters until exception occurs
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // Exception indicates end of string
        }
        return count;
    }

    // Method to extract unique characters from the string
    static char[] uniqueChars(String s) {
        int len = findLength(s);
        char[] temp = new char[len];
        int index = 0;

        // Loop to check each character
        for (int i = 0; i < len; i++) {
            boolean unique = true;

            // Check if character appeared before
            for (int j = 0; j < i; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    unique = false;
                    break;
                }
            }

            // Store unique character
            if (unique)
                temp[index++] = s.charAt(i);
        }

        // Create result array of exact size
        char[] result = new char[index];
        for (int i = 0; i < index; i++)
            result[i] = temp[i];

        return result;
    }

    public static void main(String[] args) {
        // Input string
        String text = "programming";

        // Get unique characters
        char[] result = uniqueChars(text);

        // Print unique characters
        for (char c : result)
            System.out.print(c + " ");
    }
}
