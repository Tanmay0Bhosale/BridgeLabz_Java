package JavaMehodsPractices.Level2;

import java.util.Scanner;

public class Factors {
    // This method findFactors is used to find all factors of the number n and return them as an array.
    static int[] findFactors(int n) {
        int count = 0;
        // For loop is used to count the number of factors.
        for (int i = 1; i <= n; i++)
            if (n % i == 0) count++;

        int[] f = new int[count];
        int index = 0;
        // For loop is used to store the factors in the array.
        for (int i = 1; i <= n; i++)
            if (n % i == 0) f[index++] = i;

        return f;
    }

    // This method sum is used to calculate the sum of the factors.
    static int sum(int[] f) {
        int s = 0;
        // For loop is used to sum all elements in the factors array.
        for (int x : f) s += x;
        return s;
    }

    // This method product is used to calculate the product of the factors.
    static int product(int[] f) {
        int p = 1;
        // For loop is used to multiply all elements in the factors array.
        for (int x : f) p *= x;
        return p;
    }

    // This method sumOfSquares is used to calculate the sum of squares of the factors.
    static double sumOfSquares(int[] f) {
        double s = 0;
        // For loop is used to add the square of each factor to the sum.
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
