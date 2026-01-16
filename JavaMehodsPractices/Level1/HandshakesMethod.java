package JavaMehodsPractices.Level1;

import java.util.Scanner;

public class HandshakesMethod {
    // This method calculateHandshakes is used to calculate the maximum number of handshakes among n students using the formula n*(n-1)/2.
    static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Maximum handshakes = " + calculateHandshakes(n));
    }
}
