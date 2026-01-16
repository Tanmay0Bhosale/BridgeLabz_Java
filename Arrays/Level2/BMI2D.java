package Arrays.Level2;

import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];

        // For loop is used to read weight and height for each of n persons, calculate their BMI, and determine their weight status based on BMI categories.
        for (int i = 0; i < n; i++) {
            data[i][0] = sc.nextDouble(); // weight
            data[i][1] = sc.nextDouble(); // height

            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);

            if (data[i][2] <= 18.4) status[i] = "Underweight";
            else if (data[i][2] <= 24.9) status[i] = "Normal";
            else if (data[i][2] <= 39.9) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        // For loop is used to print the weight, height, BMI, and status for each person.
        for (int i = 0; i < n; i++)
            System.out.println(data[i][0] + " " + data[i][1] + " " + data[i][2] + " " + status[i]);
    }
}
