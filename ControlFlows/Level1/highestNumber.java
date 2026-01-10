package ControlFlows.Level1;
import java.util.Scanner;
public class highestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = sc.nextInt();
        System.out.println("Enter num 2");
        int num2 = sc.nextInt();
        System.out.println("Enter num 3");
        int num3 = sc.nextInt();

        boolean isfirst = num1>num2 && num1>num3;
        boolean issecond = num2>num3 && num2>num1;
        boolean isthird = num3>num1 && num3>num2;

        System.out.println("Is the first number highest" + isfirst);
        System.out.println("Is the second number highest" + issecond);
        System.out.println("Is the third number highest" + isthird);
    }
}
