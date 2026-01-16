package Strings.Level3;

import java.util.Scanner;

public class BMICalculator {

    // This method computeBMI is used to compute BMI and status for given height and weight arrays
    static String[][] computeBMI(double[][] hw) {
        String[][] result = new String[10][4]; // result array will store height, weight, BMI, and status for each person

        // For loop is used to iterate through each person's height and weight to calculate BMI
        for (int i = 0; i < 10; i++) {
            double weight = hw[i][0]; // Extract weight from input array
            double heightM = hw[i][1] / 100; // Convert height from cm to meters
            double bmi = weight / (heightM * heightM); // Calculate BMI using the formula: weight / (height in meters)^2

            String status; // Variable to hold the BMI category
            // Determine the BMI status based on standard categories
            if (bmi <= 18.4) status = "Underweight";
            else if (bmi <= 24.9) status = "Normal";
            else if (bmi <= 39.9) status = "Overweight";
            else status = "Obese";

            result[i][0] = String.valueOf(hw[i][1]); // Store height in cm
            result[i][1] = String.valueOf(weight); // Store weight
            result[i][2] = String.format("%.2f", bmi); // Store BMI formatted to 2 decimal places
            result[i][3] = status; // Store BMI status
        }
        return result;
    }

    // This method display is used to display the computed BMI data in a tabular format
    static void display(String[][] data) {
        System.out.println("Height  Weight  BMI   Status"); // Print the table header
        // For loop is used to print each row of the BMI data
        for (String[] r : data)
            System.out.println(r[0] + "   " + r[1] + "   " + r[2] + "   " + r[3]); // Print height, weight, BMI, and status for each person
    }

    // This method main is used to execute the program, read input for height and weight, compute BMI, and display the results
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object to read input from user
        double[][] hw = new double[10][2]; // Declare 2D array to store height and weight for 10 people

        // For loop is used to read height and weight for 10 people from input
        for (int i = 0; i < 10; i++) {
            hw[i][0] = sc.nextDouble(); // Read weight for person i
            hw[i][1] = sc.nextDouble(); // Read height for person i
        }

        display(computeBMI(hw)); // Call computeBMI to calculate BMI and status, then display the results
    }
}
  
