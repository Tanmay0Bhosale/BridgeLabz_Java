package ControlFlows.Level2;

import java.util.Scanner;

public class FizzBuzzFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            // For loop is used to iterate from 1 to the input number, applying FizzBuzz rules to print "Fizz", "Buzz", "FizzBuzz", or the number itself.
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0)
                    System.out.println("FizzBuzz");
                else if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
