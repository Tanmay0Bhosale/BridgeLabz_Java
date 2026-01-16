package ControlFlows.Level2;

import java.util.Scanner;

public class FactorsFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            // For loop is used to iterate from 1 to number-1, check if each i divides the number evenly, and print the factors.
            for (int i = 1; i < number; i++) {
                if (number % i == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
