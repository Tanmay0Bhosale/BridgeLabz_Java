package ControlFlows.Level1;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        // While loop is used to count down from the input number to 1, printing each number and decrementing the counter.
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
    }
}
