import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first three digits of your account number: ");
        String accountNumberPrefix = scanner.nextLine();

        URL url = (new URI("https://ewib.nbp.pl/plewibnra?dokNazwa=plewibnra.txt")).toURL();
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        Boolean found = false;
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.startsWith(accountNumberPrefix)) {
                String[] parts = line.split("\\t+");
                String bankNumber = parts[0];
                String bankName = parts[1];
                System.out.println("Bank Number: " + bankNumber);
                System.out.println("Bank Name: " + bankName);
                found = true;
                break;
            }
        }

        reader.close();
        scanner.close();

        if (!found) {
            System.out.println("Bank not found.");
        }
    }
}
