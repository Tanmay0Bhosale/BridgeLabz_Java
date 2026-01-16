package ControlFlows.Level1;

import java.util.Scanner;

public class OddEven {
    // This method main is used to read a number, check if it's positive, and print odd/even for numbers up to it
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Create Scanner to read input from user
        int number = input.nextInt(); // Read the input number

        if (number > 0) { // Check if number is positive (natural number)
            // For loop is used to iterate from 1 to the input number
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) { // Check if i is even
                    System.out.println(i + " is Even"); // Print that i is even
                } else { // If not even, it's odd
                    System.out.println(i + " is Odd"); // Print that i is odd
                }
            }
        } else { // If number is not positive
            System.out.println("Not a natural number"); // Print error message
        }
    }
}
