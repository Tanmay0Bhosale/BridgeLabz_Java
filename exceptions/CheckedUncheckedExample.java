import java.io.*;

class CheckedUncheckedExample {

    static void processData(String input) throws IOException {
        if (input == null) {
            throw new NullPointerException("Input cannot be null");
        }
        if (input.equals("file")) {
            throw new IOException("File error occurred");
        }
    }

    public static void main(String[] args) {
        try {
            processData("file");
        } catch (IOException e) {
            System.out.println("Checked Exception: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Unchecked Exception: " + e.getMessage());
        }
    }
}
