package ControlFlows.Level2;

import java.util.Scanner;

public class PowerFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;

        // For loop is used to calculate the power by multiplying the result by the base number for each iteration up to the exponent.
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.println("Result is " + result);
    }
}
