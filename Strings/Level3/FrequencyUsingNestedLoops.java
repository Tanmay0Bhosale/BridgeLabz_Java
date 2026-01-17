package Strings.Level3;

import java.util.Scanner;

// Class to find character frequency using nested loops
public class FrequencyUsingNestedLoops {

    // Method to calculate frequency of each character in the string
    static String[] findFrequency(String text) {
        // Convert string to character array
        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        // Outer loop to pick each character
        for (int i = 0; i < chars.length; i++) {

            // Skip already counted characters
            if (chars[i] == '0')
                continue;

            freq[i] = 1;

            // Inner loop to count matching characters
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark character as counted
                }
            }
        }

        // Count number of unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++)
            if (chars[i] != '0')
                count++;

        // Array to store final frequency result
        String[] result = new String[count];
        int index = 0;

        // Store character and its frequency
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " : " + freq[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read input text
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        // Get character frequencies
        String[] result = findFrequency(text);

        // Display results
        System.out.println("Character Frequencies:");
        for (String s : result)
            System.out.println(s);
    }
}
