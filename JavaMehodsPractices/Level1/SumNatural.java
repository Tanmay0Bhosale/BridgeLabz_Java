package JavaMehodsPractices.Level1;

import java.util.Scanner;

public class SumNatural {
    // This method sum is used to calculate the sum of natural numbers from 1 to n.
    static int sum(int n) {
        int s = 0;
        // For loop is used to iterate from 1 to n, adding each number to the sum.
        for (int i = 1; i <= n; i++) s += i;
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Sum = " + sum(n));
    }
}

