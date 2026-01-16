package Arrays.Level1;

import java.util.Scanner;

public class VotingCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        // For loop is used to read the ages of 10 students from the user and store them in the array.
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Enhanced for loop is used to iterate through each age in the array, check if it's valid, and determine if the student can vote based on age being 18 or above.
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote");
            } else {
                System.out.println("The student with the age " + age + " cannot vote");
            }
        }
    }
}
