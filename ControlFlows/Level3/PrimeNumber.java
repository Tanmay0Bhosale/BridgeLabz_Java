package ControlFlows.Level3;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            // For loop is used to check if the number is divisible by any integer from 2 to number/2, setting isPrime to false if a divisor is found and breaking the loop.
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime)
            System.out.println(number + " is a Prime Number");
        else
            System.out.println(number + " is not a Prime Number");
    }
}
