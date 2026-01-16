package Arrays.Level1;

import java.util.Scanner;

public class OddEvenArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Not a natural number");
            return;
        }

        int[] odd = new int[number / 2 + 1];
        int[] even = new int[number / 2 + 1];
        int oddIndex = 0, evenIndex = 0;

        // For loop is used to iterate from 1 to the input number, check if each number is odd or even, and store them in separate arrays for odd and even numbers.
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                even[evenIndex++] = i;
            } else {
                odd[oddIndex++] = i;
            }
        }

        System.out.println("Odd Numbers:");
        // For loop is used to iterate through the odd numbers array and print each odd number.
        for (int i = 0; i < oddIndex; i++) System.out.print(odd[i] + " ");

        System.out.println("\nEven Numbers:");
        // For loop is used to iterate through the even numbers array and print each even number.
        for (int i = 0; i < evenIndex; i++) System.out.print(even[i] + " ");
    }
}
