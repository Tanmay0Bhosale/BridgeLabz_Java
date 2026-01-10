package ControlFlows.Level1;
import java.util.Scanner;
public class DivisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();

        if(num%5 == 0){
            System.out.println("Divisible By 5");
        }else{
            System.out.println("Not Divisible by 5");
        }
    }
}
