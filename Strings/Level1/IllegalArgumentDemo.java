package Strings.Level1;

import java.util.Scanner;

public class IllegalArgumentDemo {

    static void generateException(String s) {
        s.substring(5, 2); // start > end
    }

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
