package Strings.Level2;

import java.util.Random;

public class Voting {

    static int[] generateAges(int n) {
        Random r = new Random();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = r.nextInt(90) + 10;
        return a;
    }

    static String[][] check(int[] ages) {
        String[][] r = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            r[i][0] = String.valueOf(ages[i]);
            r[i][1] = String.valueOf(ages[i] >= 18);
        }
        return r;
    }

    public static void main(String[] args) {
        String[][] r = check(generateAges(10));
        for (String[] x : r)
            System.out.println(x[0] + "\t" + x[1]);
    }
}
