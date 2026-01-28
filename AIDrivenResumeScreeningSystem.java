import java.util.*;

// Base JobRole class
abstract class JobRole {
    abstract String getRole();
}

// Job roles
class SoftwareEngineer extends JobRole {
    String getRole() {
        return "Software Engineer";
    }
}

class DataScientist extends JobRole {
    String getRole() {
        return "Data Scientist";
    }
}

class ProductManager extends JobRole {
    String getRole() {
        return "Product Manager";
    }
}

// Generic Resume class
class Resume<T extends JobRole> {
    T role;

    Resume(T role) {
        this.role = role;
    }

    void process() {
        System.out.println("Processing resume for " + role.getRole());
    }
}

// Main Program
public class AIDrivenResumeScreeningSystem {
    public static void main(String[] args) {
        List<JobRole> roles = new ArrayList<>();
        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        for (JobRole role : roles) {
            System.out.println("Screening candidate for " + role.getRole());
        }
    }
}
