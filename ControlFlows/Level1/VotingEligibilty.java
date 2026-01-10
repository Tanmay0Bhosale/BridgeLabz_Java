package ControlFlows.Level1;
import java.util.Scanner;
public class VotingEligibilty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("You are not eligible");
        }else {
            System.out.println("You are eligible");
        }
    }
}
