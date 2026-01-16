package Strings.Level2;

import java.util.Scanner;

public class WordLength2D {

    // This method len is used to calculate the length of the input string
    static int len(String s) {
        int i = 0; // Initialize counter i to 0
        try { // Use try-catch to find string length by accessing characters until exception occurs
        // While loop is used to iterate through each character in the string until an exception occurs
        while (true) s.charAt(i++); }
        catch (Exception e) { return i - 1; } // Catch exception and return i-1 as the string length
    }

    // This method wordsWithLength is used to create a 2D array containing words and their lengths from the input text
    static String[][] wordsWithLength(String text) {
        String[] w = text.split(" "); // Split the input text into words using space as delimiter
        String[][] res = new String[w.length][2]; // Create 2D array to store words and their lengths
        // For loop is used to iterate through each word and store it with its length in the result array
        for (int i = 0; i < w.length; i++) {
            res[i][0] = w[i]; // Store the word
            res[i][1] = String.valueOf(len(w[i])); // Calculate and store the length of the word
        }
        return res;
    }

    // This method main is used to read input text, process words and their lengths, and display them
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner to read input from user
        String[][] r = wordsWithLength(sc.nextLine()); // Read input line and process words with their lengths

        // For loop is used to iterate through the result array and print each word with its length
        for (String[] x : r)
            System.out.println(x[0] + "\t" + Integer.parseInt(x[1])); // Print word and its length
    }
}
