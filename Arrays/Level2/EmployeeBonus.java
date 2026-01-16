package Arrays.Level2;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOld = 0, totalNew = 0;

        // For loop is used to read salary and years of service for 10 employees, validate inputs, calculate bonus based on years of service, compute new salary, and accumulate totals for bonus, old salary, and new salary.
        for (int i = 0; i < 10; i++) {
            System.out.print("Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Years of service: ");
            years[i] = sc.nextDouble();

            if (salary[i] <= 0 || years[i] < 0) {
                i--;
                continue;
            }

            if (years[i] > 5)
                bonus[i] = salary[i] * 0.05;
            else
                bonus[i] = salary[i] * 0.02;

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOld += salary[i];
            totalNew += newSalary[i];
        }

        System.out.println("Total Bonus: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOld);
        System.out.println("Total New Salary: " + totalNew);
    }
}
