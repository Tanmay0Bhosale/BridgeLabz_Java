package Strings.Level2;

import java.util.Scanner;

public class SplitCompare {

    static int length(String s) {
        int i = 0;
        try { while (true) s.charAt(i++); }
        catch (Exception e) { return i; }
    }

    static String[] splitManual(String text) {
        int words = 1;
        for (int i = 0; i < length(text); i++)
            if (text.charAt(i) == ' ') words++;

        String[] arr = new String[words];
        int start = 0, idx = 0;

        for (int i = 0; i <= length(text); i++) {
            if (i == length(text) || text.charAt(i) == ' ') {
                String w = "";
                for (int j = start; j < i; j++) w += text.charAt(j);
                arr[idx++] = w;
                start = i + 1;
            }
        }
        return arr;
    }

    static boolean compare(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++)
            if (!a[i].equals(b[i])) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] m = splitManual(text);
        String[] b = text.split(" ");

        System.out.println(compare(m, b));
    }
}
