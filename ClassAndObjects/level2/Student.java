package oopsprogrammingfundamentals.level2;

public class Student {
    String name;
    int rollNumber;
    int marks;

    String calculateGrade() {
        if (marks >= 90) return "A";
        else if (marks >= 75) return "B";
        else if (marks >= 60) return "C";
        else return "Fail";
    }

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
