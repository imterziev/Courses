package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String firstValue = scanner.nextLine();
        String secondValue = scanner.nextLine();

        switch (type) {
            case "int":
                System.out.println(getMax(Integer.parseInt(firstValue), Integer.parseInt(secondValue)));
                break;
            case "char":
                System.out.println(getMax(firstValue.charAt(0), secondValue.charAt(0)));
                break;
            case "string":
                System.out.println(getMax(firstValue, secondValue));
                break;
        }
    }

    static int getMax(int firstValue, int secondValue) {
        return Math.max(firstValue, secondValue);
    }

    static char getMax(char firstValue, char secondValue) {
        if (firstValue > secondValue) {
            return firstValue;
        }

        return secondValue;
    }

    static String getMax(String firstValue, String secondValue) {
        if (firstValue.compareTo(secondValue) >= 0) {
            return firstValue;
        }

        return secondValue;
    }
}