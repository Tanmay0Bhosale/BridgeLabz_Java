package Arrays.Level2;

import java.util.Scanner;

public class Friends {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // For loop is used to read the age and height for each of the 3 friends.
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        int youngest = 0, tallest = 0;

        // For loop is used to find the index of the youngest friend (smallest age) and the tallest friend (largest height) by comparing with the current minimum/maximum.
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngest]) youngest = i;
            if (height[i] > height[tallest]) tallest = i;
        }

        System.out.println("Youngest: " + names[youngest]);
        System.out.println("Tallest: " + names[tallest]);
    }
}
