package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        String name = scanner.nextLine();

        while (!name.equals("stop")) {
            String email = scanner.nextLine();

            if (!email.endsWith("uk") && !email.endsWith("us") && !email.endsWith("com")) {
                emails.put(name, email);
            }

            name = scanner.nextLine();
        }

        emails.entrySet()
                .forEach(e -> System.out.printf("%s -> %s\n", e.getKey(), e.getValue()));
    }
}