package JavaMehodsPractices.Level2;

import java.util.Scanner;

public class BMICalculator {
    // This method calculateBMI is used to calculate the BMI for each person using weight and height.
    static void calculateBMI(double[][] data) {
        // For loop is used to iterate through the data array and compute BMI for each entry.
        for (int i = 0; i < 10; i++) {
            double heightMeter = data[i][1] / 100;
            data[i][2] = data[i][0] / (heightMeter * heightMeter);
        }
    }

    // This method getBMIStatus is used to determine the BMI status for each person based on their BMI value.
    static String[] getBMIStatus(double[][] data) {
        String[] status = new String[10];
        // For loop is used to iterate through the data and assign status based on BMI ranges.
        for (int i = 0; i < 10; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) status[i] = "Underweight";
            else if (bmi <= 24.9) status[i] = "Normal";
            else if (bmi <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }
        return status;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        // For loop is used to read weight and height for 10 persons.
        for (int i = 0; i < 10; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height
        }

        calculateBMI(data);
        String[] status = getBMIStatus(data);

        // For loop is used to print the weight, height, BMI, and status for each person.
        for (int i = 0; i < 10; i++) {
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
        }
    }
}
