import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithFileExample {
    public static void main(String[] args) {

        // try-with-resources: FileReader and BufferedReader will close automatically
        try (BufferedReader br = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // No need for finally block — file closes automatically!
    }
}
