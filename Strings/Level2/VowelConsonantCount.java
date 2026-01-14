package Strings.Level2;

import java.util.Scanner;

public class VowelConsonantCount {

    static int[] count(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) v++;
                else c++;
            }
        }
        return new int[]{v, c};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] r = count(sc.nextLine());
        System.out.println("Vowels: " + r[0]);
        System.out.println("Consonants: " + r[1]);
    }
}

