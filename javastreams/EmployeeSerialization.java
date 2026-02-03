import java.io.*;
import java.util.*;

public class EmployeeSerialization {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Alice", "IT", 50000));
        list.add(new Employee(2, "Bob", "HR", 45000));

        // Serialization
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(list);
            System.out.println("Employees saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.dat"))) {
            List<Employee> employees = (List<Employee>) ois.readObject();
            employees.forEach(System.out::println);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
