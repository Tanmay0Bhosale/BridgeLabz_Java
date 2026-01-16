package JavaMehodsPractices.Level1;

import java.util.Scanner;

public class NumberCheck {
    // This method checkNumber is used to determine if the input number is positive (return 1), negative (return -1), or zero (return 0).
    static int checkNumber(int n) {
        if (n > 0) return 1;
        if (n < 0) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(checkNumber(num));
    }
}
