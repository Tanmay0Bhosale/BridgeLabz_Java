package Arrays.Level1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input");
            return;
        }

        String[] result = new String[number + 1];

        // For loop is used to iterate from 1 to the input number, applying FizzBuzz rules to determine whether each number should be replaced with "Fizz", "Buzz", "FizzBuzz", or remain as the number itself, and store the result in an array.
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result[i] = "FizzBuzz";
            else if (i % 3 == 0)
                result[i] = "Fizz";
            else if (i % 5 == 0)
                result[i] = "Buzz";
            else
                result[i] = String.valueOf(i);
        }

        // For loop is used to iterate through the result array and print each position with its corresponding FizzBuzz value.
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + result[i]);
        }
    }
}
