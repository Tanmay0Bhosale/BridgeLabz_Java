package classandobjects.level2;

/**
 * The Student class represents a student with name, roll number, and marks.
 * It provides methods to calculate grade based on marks and display student details.
 */
public class Student {
    String name;
    int rollNumber;
    int marks;

    // Method to calculate the grade based on marks using conditional statements
    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }

    // Method to display the student's details including calculated grade
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.rollNumber = 12;
        s.marks = 82;

        s.displayDetails();
    }
}
