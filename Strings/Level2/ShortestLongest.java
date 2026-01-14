package Strings.Level2;

import java.util.Scanner;

public class ShortestLongest {

    static int len(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    static String[] find(String text) {
        String[] w = text.split(" ");
        String min = w[0], max = w[0];
        for (String s : w) {
            if (len(s) < len(min)) min = s;
            if (len(s) > len(max)) max = s;
        }
        return new String[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] r = find(sc.nextLine());
        System.out.println("Shortest: " + r[0]);
        System.out.println("Longest: " + r[1]);
    }
}
