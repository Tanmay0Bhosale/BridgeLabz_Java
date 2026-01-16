package Arrays.Level2;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] maths = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // For loop is used to read physics, chemistry, and maths marks for each student, validate inputs, calculate percentage, and assign grade based on percentage.
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));

            System.out.print("Physics: ");
            physics[i] = sc.nextInt();
            if (physics[i] < 0) { i--; continue; }

            System.out.print("Chemistry: ");
            chemistry[i] = sc.nextInt();
            if (chemistry[i] < 0) { i--; continue; }

            System.out.print("Maths: ");
            maths[i] = sc.nextInt();
            if (maths[i] < 0) { i--; continue; }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // For loop is used to print the percentage and grade for each student.
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) +
                    " Percentage: " + percentage[i] +
                    " Grade: " + grade[i]);
        }
    }
}

