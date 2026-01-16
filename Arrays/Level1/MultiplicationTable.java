package Arrays.Level1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] table = new int[10];

        // For loop is used to generate the multiplication table for the input number from 1 to 10, store each product in the array, and print each multiplication equation.
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}
