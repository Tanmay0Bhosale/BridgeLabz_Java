import java.util.*;

public class FinallyBlockExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a: ");
            int a = sc.nextInt();

            System.out.print("Enter b: ");
            int b = sc.nextInt();

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println("Division by zero error");

        } finally {
            System.out.println("Operation completed");
        }
    }
}
