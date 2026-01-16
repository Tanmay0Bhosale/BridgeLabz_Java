package Strings.Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    // This method generateException is used to demonstrate generating an IllegalArgumentException
    static void generateException(String s) {
        s.substring(5, 2); // start > end
    }

    // This method handleException is used to handle IllegalArgumentException when substring is called with invalid indices
    static void handleException(String s) {
        try {
            s.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException handled");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        handleException(text);
    }
}
