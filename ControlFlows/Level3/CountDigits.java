package ControlFlows.Level3;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;

        // While loop is used to count the number of digits by repeatedly dividing the number by 10 until it becomes 0, incrementing the count each time.
        while (number != 0) {
            number /= 10;
            count++;
        }

        System.out.println("Number of digits: " + count);
    }
}


