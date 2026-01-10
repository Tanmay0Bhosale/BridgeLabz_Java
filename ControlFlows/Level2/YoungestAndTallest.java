package ControlFlows.Level2;

import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        int ageAkbar = input.nextInt();
        int ageAnthony = input.nextInt();

        int heightAmar = input.nextInt();
        int heightAkbar = input.nextInt();
        int heightAnthony = input.nextInt();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));

        System.out.println("The youngest age is " + youngestAge);
        System.out.println("The tallest height is " + tallestHeight);
    }
}
