package Arrays.Level1;

import java.util.Scanner;

public class SumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10];
        double total = 0.0;
        int index = 0;

        // While loop is used to continuously read numbers from the user until a non-positive number is entered or the array reaches its maximum capacity of 10 elements.
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();

            if (num <= 0 || index == 10) {
                break;
            }

            arr[index++] = num;
        }

        // For loop is used to iterate through the array elements that were entered, calculate the total sum, and print each element.
        for (int i = 0; i < index; i++) {
            total += arr[i];
            System.out.println(arr[i]);
        }

        System.out.println("Total = " + total);
    }
}

