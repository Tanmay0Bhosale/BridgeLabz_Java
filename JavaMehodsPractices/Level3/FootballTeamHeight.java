package JavaMehodsPractices.Level3;

import java.util.Random;

public class FootballTeamHeight {

    static int sum(int[] h) {
        int s = 0;
        for (int x : h) s += x;
        return s;
    }

    static double mean(int[] h) {
        return sum(h) / (double) h.length;
    }

    static int shortest(int[] h) {
        int min = h[0];
        for (int x : h) if (x < min) min = x;
        return min;
    }

    static int tallest(int[] h) {
        int max = h[0];
        for (int x : h) if (x > max) max = x;
        return max;
    }

    public static void main(String[] args) {
        int[] heights = new int[11];
        Random r = new Random();

        for (int i = 0; i < heights.length; i++)
            heights[i] = r.nextInt(101) + 150;

        System.out.println("Shortest: " + shortest(heights));
        System.out.println("Tallest: " + tallest(heights));
        System.out.println("Mean: " + mean(heights));
    }
}

