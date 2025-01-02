import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try (
                BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
                BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            String line = reader.readLine();

            while (line != null) {
                writer.write(line.replace(' ', '-'));
                writer.newLine();
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
