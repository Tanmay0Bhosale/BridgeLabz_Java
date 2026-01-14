package Strings.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    static String computer() {
        String[] c = {"rock", "paper", "scissors"};
        return c[(int)(Math.random() * 3)];
    }

    static int winner(String u, String c) {
        if (u.equals(c)) return 0;
        if ((u.equals("rock") && c.equals("scissors")) ||
                (u.equals("paper") && c.equals("rock")) ||
                (u.equals("scissors") && c.equals("paper"))) return 1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int user = 0, comp = 0;

        for (int i = 0; i < games; i++) {
            String u = sc.next();
            String c = computer();
            int w = winner(u, c);
            if (w == 1) user++;
            else if (w == -1) comp++;
            System.out.println(u + " vs " + c);
        }

        System.out.println("User Wins: " + user);
        System.out.println("Computer Wins: " + comp);
        System.out.println("User %: " + (user * 100.0 / games));
        System.out.println("Computer %: " + (comp * 100.0 / games));
    }
}

