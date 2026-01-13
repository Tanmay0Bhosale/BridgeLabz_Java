package Strings;

import java.util.Scanner;

public class CharArrayCompare {

    static char[] getChars(String s) {
        char[] arr = new char[s.length()];
        for (int i = 0; i < s.length(); i++)
            arr[i] = s.charAt(i);
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
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
