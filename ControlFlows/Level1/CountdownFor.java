package ControlFlows.Level1;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        // For loop is used to count down from the input number to 1, printing each number on a new line.
        for (int i = number; i >= 1; i--) {
            System.out.println(i);
        }
    }
}

