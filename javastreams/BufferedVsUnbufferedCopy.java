import java.io.*;

public class BufferedVsUnbufferedCopy {

    static void unbufferedCopy(String src, String dest) throws IOException {
        try (FileInputStream fis = new FileInputStream(src);
             FileOutputStream fos = new FileOutputStream(dest)) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }

    static void bufferedCopy(String src, String dest) throws IOException {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytesRead);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";

        long start = System.nanoTime();
        unbufferedCopy(source, "unbuffered.dat");
        long end = System.nanoTime();
        System.out.println("Unbuffered Time: " + (end - start) / 1_000_000 + " ms");

        start = System.nanoTime();
        bufferedCopy(source, "buffered.dat");
        end = System.nanoTime();
        System.out.println("Buffered Time: " + (end - start) / 1_000_000 + " ms");
    }
}
