package Arrays.Level1;

import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int maxSize = 10;
        int[] factors = new int[maxSize];
        int index = 0;

        // For loop is used to iterate from 1 to the input number, check if each number is a factor (divides evenly), and store the factors in an array with dynamic resizing if needed.
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                if (index == maxSize) {
                    maxSize *= 2;
                    int[] temp = new int[maxSize];
                    System.arraycopy(factors, 0, temp, 0, factors.length);
                    factors = temp;
                }
                factors[index++] = i;
            }
        }

        // For loop is used to iterate through the stored factors array and print each factor.
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
