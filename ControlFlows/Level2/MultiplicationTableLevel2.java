package ControlFlows.Level2;


import java.util.Scanner;

    public class MultiplicationTableLevel2 {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int number = input.nextInt();

            // For loop is used to generate and print the multiplication table for the input number with multipliers from 6 to 9.
            for (int i = 6; i <= 9; i++) {
                System.out.println(number + " * " + i + " = " + (number * i));
            }
        }
    }
