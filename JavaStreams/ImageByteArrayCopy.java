import java.io.*;

public class ImageByteArrayCopy {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("input.jpg");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int read;
        while ((read = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, read);
        }

        byte[] imageBytes = baos.toByteArray();

        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        FileOutputStream fos = new FileOutputStream("output.jpg");

        while ((read = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, read);
        }

        fis.close();
        fos.close();

        System.out.println("Image copied successfully.");
    }
}
