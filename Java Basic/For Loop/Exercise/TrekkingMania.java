package ProgrammingBasic.ForLoop.Exercise;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int groups = Integer.parseInt(scanner.nextLine());

        double musala = 0;
        double monblan = 0;
        double kilimandjarno = 0;
        double k2 = 0;
        double everest = 0;
        double people = 0;

        for (int i = 0; i < groups; i++) {

            int peopleInGroup = Integer.parseInt(scanner.nextLine());

            people += peopleInGroup;

            if (peopleInGroup <= 5) {
                musala += peopleInGroup;
            } else if (peopleInGroup <= 12) {
                monblan += peopleInGroup;
            } else if (peopleInGroup <= 25) {
                kilimandjarno += peopleInGroup;
            } else if (peopleInGroup <= 40) {
                k2 += peopleInGroup;
            } else {
                everest += peopleInGroup;
            }
        }

        musala = musala / people * 100;
        monblan = monblan / people * 100;
        kilimandjarno = kilimandjarno / people * 100;
        k2 = k2 / people * 100;
        everest = everest / people * 100;

        System.out.printf("%.2f%%%n", musala);
        System.out.printf("%.2f%%%n", monblan);
        System.out.printf("%.2f%%%n", kilimandjarno);
        System.out.printf("%.2f%%%n", k2);
        System.out.printf("%.2f%%%n", everest);
    }
}