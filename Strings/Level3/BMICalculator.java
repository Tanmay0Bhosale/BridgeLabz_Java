import java.util.Scanner;

// Class to calculate and display BMI details for multiple people
public class BMICalculator {

    // Method to calculate BMI and determine status for each person
    static String[][] calculateBMI(double[][] data) {
        String[][] result = new String[10][4];

        // Loop to process BMI for each person
        for (int i = 0; i < 10; i++) {
            double weight = data[i][0];
            double heightMeter = data[i][1] / 100;
            double bmi = weight / (heightMeter * heightMeter);

            // Determine BMI status
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";

            // Store height, weight, BMI, and status as strings
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    // Method to display BMI results in tabular format
    static void display(String[][] result) {
        System.out.println("Height(cm)\tWeight\tBMI\tStatus");

        // Loop to print each row of the result
        for (String[] row : result) {
            for (String val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // 2D array to store weight and height of 10 people
        double[][] data = new double[10][2];

        // Loop to read input data
        for (int i = 0; i < 10; i++) {
            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();
            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        // Calculate BMI and display the results
        display(calculateBMI(data));
    }
}
