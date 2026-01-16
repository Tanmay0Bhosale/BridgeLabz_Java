package ControlFlows.Level2;

import java.util.Scanner;

public class OddEvenLevel2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number > 0) {
            // For loop is used to iterate from 1 to the input number, check if each i is even or odd, and print the result.
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is Even");
                else
                    System.out.println(i + " is Odd");
            }
        } else {
            System.out.println("Not a natural number");
        }
    }
}
