package Strings.Level2;

import java.util.Random;

public class Voting {

    // This method generateAges is used to generate an array of random ages between 10 and 99
    static int[] generateAges(int n) {
        Random r = new Random(); // Create Random object for generating random numbers
        int[] a = new int[n]; // Create array to hold the ages
        // For loop is used to generate and store random ages in the array
        for (int i = 0; i < n; i++) a[i] = r.nextInt(90) + 10; // Generate random age between 10 and 99 and store in array
        return a;
    }

    // This method check is used to create a 2D array with ages and their voting eligibility status
    static String[][] check(int[] ages) {
        String[][] r = new String[ages.length][2]; // Create 2D array to store age and eligibility status
        // For loop is used to iterate through each age and set voting eligibility
        for (int i = 0; i < ages.length; i++) {
            r[i][0] = String.valueOf(ages[i]); // Store age as string
            r[i][1] = String.valueOf(ages[i] >= 18); // Store true if age >=18 (eligible to vote), else false
        }
        return r;
    }

    // This method main is used to generate ages, check voting eligibility, and display the results
    public static void main(String[] args) {
        String[][] r = check(generateAges(10)); // Generate 10 random ages and check their voting eligibility
        // For loop is used to print each age with its voting eligibility
        for (String[] x : r)
            System.out.println(x[0] + "\t" + x[1]); // Print age and eligibility status
    }
}
