package Arrays.Level1;

import java.util.Scanner;

public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] result = new int[4];

        int index = 0;
        // For loop is used to calculate the products of the input number multiplied by 6 through 9 and store them in the result array.
        for (int i = 6; i <= 9; i++) {
            result[index++] = number * i;
        }

        index = 0;
        // For loop is used to print the multiplication table for the input number with multipliers 6 to 9 using the pre-calculated results from the array.
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[index++]);
        }
    }
}

