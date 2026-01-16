package ControlFlows.Level2;

import java.util.Scanner;

public class MultiplesFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0 && number < 100) {
            // For loop is used to iterate from 100 down to 1, check if each i is a multiple of the input number, and print it if so.
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0)
                    System.out.println(i);
            }
        } else {
            System.out.println("Invalid input");
        }
    }
}
