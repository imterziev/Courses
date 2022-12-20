package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class RageExpenses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loses = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int breakHeadset = 0;
        int breakMouse = 0;
        int breakKeyboard = 0;
        int plusBreakKeyboard = 0;
        int breakDisplay = 0;

        double sum = 0;

        for (int i = 1; i <= loses; i++) {
            if (i % 2 == 0) {
                breakHeadset++;
            }

            if (i % 3 == 0) {
                breakMouse++;
            }

            if (i % 6 == 0 && breakMouse != 0 && breakHeadset != 0) {
                breakKeyboard++;
                plusBreakKeyboard++;
            }

            if (breakKeyboard % 2 == 0 && breakKeyboard != 0) {
                breakDisplay++;
                breakKeyboard -= 2;
            }
        }

        sum = breakHeadset * priceHeadset + breakMouse * priceMouse + plusBreakKeyboard * priceKeyboard + breakDisplay * priceDisplay;

        System.out.printf("Rage expenses: %.2f lv.", sum);
    }
}