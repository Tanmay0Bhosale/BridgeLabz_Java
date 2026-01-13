package JavaMehodsPractices.Level2;

import java.util.Scanner;

public class Factors {
    static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[index++] = i;

        return f;
    }

    static int sum(int[] f) {
        int s = 0;
        for (int x : f) s += x;
        return s;
    }

    static int product(int[] f) {
        int p = 1;
        for (int x : f) p *= x;
        return p;
    }

    static double sumOfSquares(int[] f) {
        double s = 0;
        for (int x : f) s += Math.pow(x, 2);
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] f = findFactors(n);
        System.out.println(sum(f));
        System.out.println(product(f));
        System.out.println(sumOfSquares(f));
    }
}
