package ControlFlows.Level1;

import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0.0;
        double value;

        // While loop is used to read numbers from the user and add them to the total until zero is entered.
        while ((value = input.nextDouble()) != 0) {
            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}