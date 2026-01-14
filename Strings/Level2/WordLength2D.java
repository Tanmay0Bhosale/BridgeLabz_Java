package Strings.Level2;

import java.util.Scanner;

public class WordLength2D {

    static int len(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    static String[][] wordsWithLength(String text) {
        String[] w = text.split(" ");
        String[][] res = new String[w.length][2];
        for (int i = 0; i < w.length; i++) {
            res[i][0] = w[i];
            res[i][1] = String.valueOf(len(w[i]));
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] r = wordsWithLength(sc.nextLine());

        for (String[] x : r)
            System.out.println(x[0] + "\t" + Integer.parseInt(x[1]));
    }
}
