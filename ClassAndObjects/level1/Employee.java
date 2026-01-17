package ClassAndObjects.level1;

/**
 * The Employee class represents an employee with attributes like name, ID, and salary.
 * It provides functionality to display the employee's details.
 */
public class Employee {
    String name;
    int id;
    double salary;

    // Method to display the employee's details
    void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.name = "Rahul";
        emp.id = 101;
        emp.salary = 45000;

        emp.displayDetails();
    }
}
