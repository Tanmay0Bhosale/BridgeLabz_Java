package ControlFlows.Level3;

import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int temp = number;
        int sum = 0;

        // While loop is used to calculate the sum of digits by extracting each digit from the number and adding to sum, dividing temp by 10 each time.
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (number % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not a Harshad Number");
    }
}

