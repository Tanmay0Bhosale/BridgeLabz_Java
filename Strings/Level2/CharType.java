package Strings.Level2;

import java.util.Scanner;

public class CharType {

    static String type(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z')
            return "aeiou".indexOf(ch) >= 0 ? "Vowel" : "Consonant";
        return "Not a Letter";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length(); i++)
            System.out.println(s.charAt(i) + " -> " + type(s.charAt(i)));
    }
}
