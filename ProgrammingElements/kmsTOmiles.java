package ProgrammingElements;

import java.util.Scanner;

public class kmsTOmiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the kms that you want to convert:");
        float kms = sc.nextFloat();
        float miles = kms * 1.609f;

        System.out.println("The miles in kms is: " + miles);
    }
}
