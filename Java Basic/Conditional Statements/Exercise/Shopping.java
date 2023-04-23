package ProgrammingBasic.ConditionalStatements.Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicsCard = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double priceGC = graphicsCard * 250;
        double priceCPU = (priceGC * 0.35) * cpu;
        double priceRAM = (priceGC * 0.10) * ram;

        double totalPrice = priceGC + priceCPU + priceRAM;

        if (graphicsCard > cpu) {
            totalPrice = totalPrice * 0.85;
        }

        double difference = Math.abs(budget - totalPrice);

        if (budget >= totalPrice) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}