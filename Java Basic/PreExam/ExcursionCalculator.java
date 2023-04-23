package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class ExcursionCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0;

        if (people <= 5) {
            switch (season) {
                case "spring":
                    price = people * 50;
                    break;
                case "summer":
                    price = people * 48.50;
                    price *= 0.85;
                    break;
                case "autumn":
                    price = people * 60;
                    break;
                case "winter":
                    price = people * 86;
                    price = price + (price * 0.08);
                    break;
            }
        } else {
            switch (season) {
                case "spring":
                    price = people * 48;
                    break;
                case "summer":
                    price = people * 45;
                    price *= 0.85;
                    break;
                case "autumn":
                    price = people * 49.50;
                    break;
                case "winter":
                    price = people * 85;
                    price = price + (price * 0.08);
                    break;
            }
        }

        System.out.printf("%.2f leva.", price);
    }
}