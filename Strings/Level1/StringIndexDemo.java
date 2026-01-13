package Strings.Level1;

import java.util.Scanner;

public class StringIndexDemo {

    static void generateException(String s) {
        s.charAt(s.length()); // Exception
    }

    static void handleException(String s) {
        try {
            s.charAt(s.length());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();

        // generateException(text);
        handleException(text);
    }
}
