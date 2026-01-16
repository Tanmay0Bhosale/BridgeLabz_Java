package Arrays.Level2;

import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int[] freq = new int[10];

        // While loop is used to extract each digit from the number by repeatedly taking modulo 10 and dividing by 10, and increment the frequency count for each digit.
        while (number != 0) {
            int digit = number % 10;
            freq[digit]++;
            number /= 10;
        }

        // For loop is used to iterate through digits 0 to 9 and print their frequencies.
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " -> " + freq[i]);
        }
    }
}

