package ProgrammingFundamentals.BasicSyntax_ConditionalStatementsAndLoops.Exercise;

import java.util.Scanner;

public class Ages {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ages = Integer.parseInt(scanner.nextLine());

        String human = "";

        if (ages >= 0 && ages <= 2) {
            human = "baby";
        } else if (ages >= 3 && ages <= 13) {
            human = "child";
        } else if (ages >= 14 && ages <= 19) {
            human = "teenager";
        } else if (ages >= 20 && ages <= 65) {
            human = "adult";
        } else if (ages >= 66) {
            human = "elder";
        }

        System.out.println(human);
    }
}