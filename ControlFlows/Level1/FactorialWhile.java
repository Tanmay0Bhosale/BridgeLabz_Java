package ControlFlows.Level1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            int factorial = 1;
            int i = 1;

            // While loop is used to calculate the factorial by multiplying the current factorial value with each integer from 1 to the input number, incrementing i each time.
            while (i <= number) {
                factorial *= i;
                i++;
            }

            System.out.println("Factorial is " + factorial);
        } else {
            System.out.println("Not a natural number");
        }
    }
}
