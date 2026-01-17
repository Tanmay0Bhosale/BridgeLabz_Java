package ConstructorsAndInstances.Level2;

public class EmployeeRecords {

    public int employeeID;
    protected String department;
    private double salary;

    public EmployeeRecords(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to modify salary
    public void updateSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }
}

// Subclass in SAME file
class Manager extends EmployeeRecords  {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID +
                ", Department: " + department);
    }
}
