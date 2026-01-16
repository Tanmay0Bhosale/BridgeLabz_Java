package JavaMehodsPractices.Level1;

import java.util.Scanner;

public class AthleteRun {
    // This method calculateRounds is used to calculate the number of rounds an athlete needs to run 5000 meters based on the perimeter of the track.
    static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000 / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("Rounds required = " + calculateRounds(a, b, c));
    }
}

