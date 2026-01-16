package ControlFlows.Level2;

import java.util.Scanner;

public class MultiplesWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int counter = 100;

        if (number > 0 && number < 100) {
            // While loop is used to iterate from 100 down to 1, check if counter is a multiple of the input number, print it if so, and decrement counter.
            while (counter >= 1) {
                if (counter % number == 0)
                    System.out.println(counter);
                counter--;
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
