package JavaMehodsPractices.Level2;

import java.util.Scanner;

public class Friends {
    static int youngest(int[] age) {
        int min = 0;
        for (int i = 1; i < 3; i++)
            if (age[i] < age[min]) min = i;
        return min;
    }

    static int tallest(double[] h) {
        int max = 0;
        for (int i = 1; i < 3; i++)
            if (h[i] > h[max]) max = i;
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] age = new int[3];
        double[] height = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }

        System.out.println(names[youngest(age)]);
        System.out.println(names[tallest(height)]);
    }
}
