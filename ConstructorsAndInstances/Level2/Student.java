package ConstructorsAndInstances.Level2;

/**
 * The Student class represents a student with roll number, name, and CGPA, demonstrating access modifiers.
 * It provides getter and setter for private CGPA, and includes a subclass PostgraduateStudent.
 */
public class Student {

    public int rollNumber;
    protected String name;
    private double cgpa;

    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Getter for private CGPA
    public double getCgpa() {
        return cgpa;
    }

    // Setter for private CGPA
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}

// Subclass in SAME file
class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name);
    }
}
