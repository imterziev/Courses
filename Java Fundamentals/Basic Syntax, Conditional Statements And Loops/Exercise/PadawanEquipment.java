package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceLightsabers = Double.parseDouble(scanner.nextLine());
        double priceRobes = Double.parseDouble(scanner.nextLine());
        double priceBelts = Double.parseDouble(scanner.nextLine());

        int studentsBelts = 0;
        double sum = 0;

        if (students / 6 >= 1) {
            studentsBelts = students - (students / 6);
        } else {
            studentsBelts = students;
        }

        sum = priceLightsabers * (students + Math.ceil(students * 0.10)) + priceBelts * studentsBelts + priceRobes * students;

        if (money >= sum) {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", sum - money);
        }
    }
}