package ControlFlows.Level2;

import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;

        // While loop is used to iterate from number-1 down to 1, find the first (greatest) factor of the number, and break once found, decrementing counter each time.
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        System.out.println("Greatest factor is " + greatestFactor);
    }
}
