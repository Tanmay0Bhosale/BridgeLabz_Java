package Strings.Level1;

import java.util.Scanner;

public class LowerCaseConvert {

    static String toLowerUsingCharAt(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z')
                result += (char)(c + 32);
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

        String userLower = toLowerUsingCharAt(text);
        String builtInLower = text.toLowerCase();

        System.out.println("Same: " + compare(userLower, builtInLower));
    }
}

