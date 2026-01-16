package ControlFlows.Level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int original = number;
        int sum = 0;

        // While loop is used to extract each digit from the original number, calculate the cube of each digit, sum them up, and divide the original by 10 each time.
        while (original != 0) {
            int digit = original % 10;
            sum += digit * digit * digit;
            original /= 10;
        }

        if (sum == number)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }
}

