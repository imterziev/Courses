package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double priceParty = Double.parseDouble(scanner.nextLine());
        int loveLetters = Integer.parseInt(scanner.nextLine());
        int candles = Integer.parseInt(scanner.nextLine());
        int keychains = Integer.parseInt(scanner.nextLine());
        int drawings = Integer.parseInt(scanner.nextLine());
        int surprises = Integer.parseInt(scanner.nextLine());

        double priceLoveLetters = loveLetters * 0.60;
        double priceCandles = candles * 7.20;
        double priceKeychains = keychains * 3.60;
        double priceDrawings = drawings * 18.20;
        double priceSurprises = surprises * 22;

        int totalProducts = loveLetters + candles + keychains + drawings + surprises;
        double totalPrice = priceLoveLetters + priceCandles + priceKeychains + priceDrawings + priceSurprises;

        if (totalProducts >= 25) {
            totalPrice *= 0.65;
        }

        totalPrice *= 0.90;

        double difference = Math.abs(priceParty - totalPrice);

        if (totalPrice >= priceParty) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}