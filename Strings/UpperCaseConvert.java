package Strings;

import java.util.Scanner;

public class UpperCaseConvert {

    static String toUpperUsingCharAt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z')
                result += (char)(c - 32);
            else
                result += c;
        }
        return result;
    }

    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
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
