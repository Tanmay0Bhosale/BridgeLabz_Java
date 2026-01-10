package ControlFlows.Level1;
import java.util.Scanner;
public class smallestFirst {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a =sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("A is not the smallest number");
        }else{
            System.out.println("A the smallest number");
        }
    }
}
