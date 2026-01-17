package Strings.Level3;

import java.util.Scanner;

// Class to find character frequency using unique character extraction
public class FrequencyUsingUnique {

    // Method to extract unique characters from the given text
    static char[] uniqueCharacters(String text) {
        char[] temp = new char[text.length()];
        int index = 0;

        // Loop to check each character
        for (int i = 0; i < text.length(); i++) {
            boolean isUnique = true;

            // Check if character already appeared before
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            // Store unique character
            if (isUnique)
                temp[index++] = text.charAt(i);
        }

        // Create array of exact size for unique characters
        char[] unique = new char[index];
        for (int i = 0; i < index; i++)
            unique[i] = temp[i];

        return unique;
    }

    // Method to calculate frequency of each unique character
    static String[][] findFrequency(String text) {
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++)
            freq[text.charAt(i)]++;

        // Get unique characters
        char[] uniqueChars = uniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        // Store character and its frequency
        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }

        return result;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input text
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Find frequency of characters
        String[][] result = findFrequency(text);

        // Display character frequencies
        System.out.println("Character  Frequency");
        for (String[] row : result)
            System.out.println(row[0] + "\t\t" + row[1]);
    }
}
