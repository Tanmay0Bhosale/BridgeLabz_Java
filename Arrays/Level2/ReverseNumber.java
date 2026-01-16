package Arrays.Level2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int temp = num, count = 0;
        // While loop is used to count the number of digits in the input number.
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        // For loop is used to extract each digit from the number and store them in an array in reverse order.
        for (int i = 0; i < count; i++) {
            digits[i] = num % 10;
            num /= 10;
        }

        // Enhanced for loop is used to print each digit from the array.
        for (int d : digits) {
            System.out.print(d);
        }
    }
}
