package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class PCStore {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double cpu = Double.parseDouble(scanner.nextLine());
        double graphicCard = Double.parseDouble(scanner.nextLine());
        double ram = Double.parseDouble(scanner.nextLine());
        int countRam = Integer.parseInt(scanner.nextLine());
        double percentage = Double.parseDouble(scanner.nextLine());

        double priceCPU = cpu * 1.57;
        double priceGraphicCard = graphicCard * 1.57;
        double priceRam = (ram * countRam) * 1.57;

        double discountCpu = priceCPU - (priceCPU * percentage);
        double discountGraphicCard = priceGraphicCard - (priceGraphicCard * percentage);

        double totalPrice = discountCpu + discountGraphicCard + priceRam;

        System.out.printf("Money needed - %.2f leva.", totalPrice);
    }
}