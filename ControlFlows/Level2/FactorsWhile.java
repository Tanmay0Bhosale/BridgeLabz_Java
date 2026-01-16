package ControlFlows.Level2;

import java.util.Scanner;

public class FactorsWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int i = 1;

        if (number > 0) {
            // While loop is used to iterate from 1 to number-1, check if each i divides the number evenly, print the factors, and increment i.
            while (i < number) {
                if (number % i == 0)
                    System.out.println(i);
                i++;
            }
        } else {
            System.out.println("Not a positive integer");
        }
    }
}
