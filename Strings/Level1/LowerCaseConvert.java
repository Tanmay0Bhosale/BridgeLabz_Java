package Strings.Level1;

import java.util.Scanner;

public class LowerCaseConvert {

    // This method toLowerUsingCharAt is used to convert a string to lowercase manually
    static String toLowerUsingCharAt(String s) {
        String result = "";
        // For loop is used to iterate through each character and convert uppercase to lowercase
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                result += (char)(c + 32);
            else
                result += c;
        }
        return result;
    }

    // This method compare is used to compare two strings for equality
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        // For loop is used to check each character for equality
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String userLower = toLowerUsingCharAt(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Same: " + compare(userLower, builtInLower));
    }
}

