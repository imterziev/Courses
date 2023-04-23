package JavaOOP.WorkingWithAbstraction.Exercises.CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        RankPower rankPower = RankPower.valueOf(scanner.nextLine());
        SuitPower suitPower = SuitPower.valueOf(scanner.nextLine());

        Card card = new Card(rankPower, suitPower);

        System.out.println(card);
    }
}