package constructorsandinstances.Level2;

/**
 * The Course class represents a course with name, duration, fee, and a static institute name.
 * It demonstrates instance and static variables and methods.
 */
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

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println(courseName + " | " + duration + " weeks | INR " + fee +
                " | Institute: " + instituteName);
    }

    // Class method to update the institute name
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
