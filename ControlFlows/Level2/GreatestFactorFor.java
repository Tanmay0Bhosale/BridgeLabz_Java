package ControlFlows.Level2;

import java.util.Scanner;

public class GreatestFactorFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;

        // For loop is used to iterate from number-1 down to 1, find the first (greatest) factor of the number, and break once found.
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.println("Greatest factor is " + greatestFactor);
    }
}
