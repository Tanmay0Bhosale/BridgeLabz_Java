package Strings.Level1;

import java.util.Scanner;

public class UpperCaseConvert {

    // This method toUpperUsingCharAt is used to convert the input string to uppercase by manipulating characters
    static String toUpperUsingCharAt(String s) {
        String result = "";
        // For loop is used to iterate through each character in the string and convert lowercase letters to uppercase
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            else
                result += c;
        }
        return result;
    }

    // This method compare is used to check if two strings are identical by comparing each character
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        // For loop is used to iterate through each character in the strings and check for equality
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userUpper = toUpperUsingCharAt(text);
        String builtInUpper = text.toUpperCase();

        System.out.println("Same: " + compare(userUpper, builtInUpper));
    }
}
