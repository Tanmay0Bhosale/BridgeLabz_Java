package ConstructorsAndInstances.Level2;



public class Course {

    // Instance variables
    String courseName;
    int duration;
    double fee;

    // Class variable
    static String instituteName = "BridgeLabz";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method
    public void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " weeks | INR " + fee +
                " | Institute: " + instituteName);
    }

    // Class method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
