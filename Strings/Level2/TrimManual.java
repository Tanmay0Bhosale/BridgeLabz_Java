package Strings.Level2;

import java.util.Scanner;

public class TrimManual {

    // This method trimIndex is used to find the start and end indices after trimming spaces
    static int[] trimIndex(String s) {
        int start = 0, end = s.length() - 1; // Initialize start to 0 and end to last index
        // While loop is used to find the start index by skipping leading spaces
        while (s.charAt(start) == ' ') start++;
        // While loop is used to find the end index by skipping trailing spaces
        while (s.charAt(end) == ' ') end--;
        return new int[]{start, end + 1}; // Return array with start and end+1 indices
    }

    // This method substring is used to extract a substring from start to end index
    static String substring(String s, int a, int b) {
        String r = ""; // Initialize result string
        // For loop is used to build the substring by appending characters from start to end
        for (int i = a; i < b; i++) r += s.charAt(i); // Append each character to result
        return r;
    }

    // This method compare is used to check if two strings are equal
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false; // If lengths differ, strings are not equal
        // For loop is used to compare each character of the two strings
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false; // If any character differs, return false
        return true; // All characters match, return true
    }

    // This method main is used to read input, perform manual trim, compare with built-in trim, and output the result
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner for input
        String text = sc.nextLine(); // Read input string

        int[] idx = trimIndex(text); // Get start and end indices after trimming
        String manual = substring(text, idx[0], idx[1]); // Extract trimmed substring manually
        String builtIn = text.trim(); // Use built-in trim method

        System.out.println(compare(manual, builtIn)); // Compare manual and built-in trim results and print true if equal
    }
}
