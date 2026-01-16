package Strings.Level1;

import java.util.Scanner;

public class CharArrayCompare {

    // This method getChars is used to convert a string to a character array manually
    static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        // For loop is used to iterate through each character in the string and store in array
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        return arr;
    }

    // This method compareArrays is used to compare two character arrays for equality
    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        // For loop is used to check each character pair for equality
        for (int i = 0; i < a.length; i++)
            if (a[i] != b[i]) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        char[] userArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        System.out.println("Arrays same: " + compareArrays(userArray, builtInArray));
    }
}
