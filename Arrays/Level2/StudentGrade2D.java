package Arrays.Level2;

import java.util.Scanner;

public class StudentGrade2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] marks = new int[n][3];
        double[] percent = new double[n];
        char[] grade = new char[n];

        // Nested for loops are used to read marks for physics, chemistry, and maths for each student, with validation for negative marks.
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
                if (marks[i][j] < 0) { j--; }
            }

            percent[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percent[i] >= 80) grade[i] = 'A';
            else if (percent[i] >= 70) grade[i] = 'B';
            else if (percent[i] >= 60) grade[i] = 'C';
            else if (percent[i] >= 50) grade[i] = 'D';
            else if (percent[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // For loop is used to print the percentage and grade for each student.
        for (int i = 0; i < n; i++)
            System.out.println(percent[i] + " " + grade[i]);
    }
}
