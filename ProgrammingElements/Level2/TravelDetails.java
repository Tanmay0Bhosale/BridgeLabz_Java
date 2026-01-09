package ProgrammingElements.Level2;

import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.next();
        String fromCity = input.next();
        String viaCity = input.next();
        String toCity = input.next();

        double fromToVia = input.nextDouble();
        double viaToFinalCity = input.nextDouble();
        double time = input.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double speed = totalDistance / time;

        System.out.println(
                name + " travels from " + fromCity +
                        " to " + toCity + " via " + viaCity +
                        " covering a distance of " + totalDistance +
                        " miles in " + time + " hours with average speed " + speed
        );
    }
}
