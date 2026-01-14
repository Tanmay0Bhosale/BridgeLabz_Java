package Strings.Level2;

import java.util.Random;

public class StudentGradeCard {

    static int[][] generatePCM(int students) {
        Random r = new Random();
        int[][] pcm = new int[students][3];
        for (int i = 0; i < students; i++)
            for (int j = 0; j < 3; j++)
                pcm[i][j] = r.nextInt(90) + 10; // 2-digit
        return pcm;
    }

    static double[][] calculateStats(int[][] pcm) {
        double[][] stats = new double[pcm.length][3]; // total, avg, %
        for (int i = 0; i < pcm.length; i++) {
            double total = pcm[i][0] + pcm[i][1] + pcm[i][2];
            double avg = total / 3;
            double pct = Math.round(avg * 100.0) / 100.0;
            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = pct;
        }
        return stats;
    }

    static char[] calculateGrades(double[][] stats) {
        char[] g = new char[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double p = stats[i][2];
            if (p >= 80) g[i] = 'A';
            else if (p >= 70) g[i] = 'B';
            else if (p >= 60) g[i] = 'C';
            else if (p >= 50) g[i] = 'D';
            else if (p >= 40) g[i] = 'E';
            else g[i] = 'R';
        }
        return g;
    }

    static void display(int[][] pcm, double[][] stats, char[] g) {
        System.out.println("P C M | Total Avg % Grade");
        for (int i = 0; i < pcm.length; i++)
            System.out.printf("%d %d %d | %.0f %.2f %.2f %c%n",
                    pcm[i][0], pcm[i][1], pcm[i][2],
                    stats[i][0], stats[i][1], stats[i][2], g[i]);
    }

    public static void main(String[] args) {
        int students = 5;
        int[][] pcm = generatePCM(students);
        double[][] stats = calculateStats(pcm);
        char[] grades = calculateGrades(stats);
        display(pcm, stats, grades);
    }
}
