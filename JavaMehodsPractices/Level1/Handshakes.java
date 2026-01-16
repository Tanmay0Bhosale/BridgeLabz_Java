package JavaMehodsPractices.Level1;

import java.util.Scanner;
//calculates handshakes with use of a formula
public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum handshakes = " + handshakes);
    }
}
