package ControlFlows.Level2;

import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();

        int result = 1;
        int counter = 0;

        // While loop is used to calculate the power by multiplying the result by the base number until the counter reaches the exponent, incrementing counter each time.
        while (counter < power) {
            result *= number;
            counter++;
        }

        System.out.println("Result is " + result);
    }
}

