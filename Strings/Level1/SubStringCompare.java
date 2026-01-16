package Strings.Level1;

import java.util.Scanner;

public class SubStringCompare {

    // This method substringUsingCharAt is used to extract a substring from the input text between the start and end indices
    static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        // For loop is used to iterate from start to end index and build the substring
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // This method compareStrings is used to check if two strings are identical
    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        // For loop is used to iterate through each character in the strings and check for equality
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int start = sc.nextInt();
        int end = sc.nextInt();

        String s1 = substringUsingCharAt(text, start, end);
        String s2 = text.substring(start, end);

        System.out.println("Match: " + compareStrings(s1, s2));
    }
}
