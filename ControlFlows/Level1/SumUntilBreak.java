package ControlFlows.Level1;

import java.util.Scanner;

public class SumUntilBreak {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        // While loop is used to continuously read numbers from the user and add them to the total until a non-positive number is entered, at which point it breaks.
        while (true) {
            double value = input.nextDouble();
            if (value <= 0) {
                break;
            }
            total += value;
        }

        System.out.println("The total sum is " + total);
    }
}
