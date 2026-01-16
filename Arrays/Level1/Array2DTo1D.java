package Arrays.Level1;

import java.util.Scanner;

public class Array2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] array = new int[rows * cols];

        // Nested for loops are used to read input values from the user and populate the 2D matrix row by row and column by column.
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();

        int index = 0;
        // Nested for loops are used to iterate through each element of the 2D matrix and copy them into a 1D array in row-major order.
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                array[index++] = matrix[i][j];

        // Enhanced for loop is used to iterate through each element of the 1D array and print them with a space separator.
        for (int val : array) {
            System.out.print(val + " ");
        }
    }
}
