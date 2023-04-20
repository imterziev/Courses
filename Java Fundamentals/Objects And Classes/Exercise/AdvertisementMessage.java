package ProgrammingFundamentals.ObjectsAndClasses.Exercise;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.", "Best product of its category.", "Exceptional product.", "I can't live without this product."};
        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!", "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        String[] city = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        for (int i = 1; i <= input; i++) {
            String advertise = phrases[random.nextInt(phrases.length)] + " " + events[random.nextInt(events.length)] + " " + authors[random.nextInt(authors.length)] + " " + city[random.nextInt(city.length)];
            System.out.println(advertise);
        }
    }
}