import java.util.*;

// Base course type
abstract class CourseType {
    abstract void evaluate();
}

// Course types
class ExamCourse extends CourseType {
    void evaluate() {
        System.out.println("Exam based evaluation");
    }
}

class AssignmentCourse extends CourseType {
    void evaluate() {
        System.out.println("Assignment based evaluation");
    }
}

class ResearchCourse extends CourseType {
    void evaluate() {
        System.out.println("Research based evaluation");
    }
}

// Generic Course class
class Course<T extends CourseType> {
    T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    void conductEvaluation() {
        courseType.evaluate();
    }
}

// Main Program
public class UniversityCourseManagementSystem {
    public static void main(String[] args) {
        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse());
        courses.add(new AssignmentCourse());
        courses.add(new ResearchCourse());

        for (CourseType course : courses) {
            course.evaluate();
        }
    }
}
