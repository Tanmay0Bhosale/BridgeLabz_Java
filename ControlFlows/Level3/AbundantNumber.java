package ControlFlows.Level3;

import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sum = 0;

        // For loop is used to iterate from 1 to number-1, find all proper divisors of the number, and sum them up.
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }

        if (sum > number)
            System.out.println("Abundant Number");
        else
            System.out.println("Not an Abundant Number");
    }
}
