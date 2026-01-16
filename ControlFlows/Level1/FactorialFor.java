package ControlFlows.Level1;

import java.util.Scanner;

public class FactorialFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;

            // For loop is used to calculate the factorial by multiplying the current factorial value with each integer from 1 to the input number.
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
