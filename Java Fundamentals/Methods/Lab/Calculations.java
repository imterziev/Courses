package ProgrammingFundamentals.Methods.Lab;

import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operations = scanner.nextLine();
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (operations.equals("add")) {
            add(firstNumber, secondNumber);
        } else if (operations.equals("multiply")) {
            multiply(firstNumber, secondNumber);
        } else if (operations.equals("subtract")) {
            subtract(firstNumber, secondNumber);
        } else if (operations.equals("divide")) {
            divide(firstNumber, secondNumber);
        }
    }

    private static void add(int firstNumber, int secondNumber) {
        System.out.println(firstNumber + secondNumber);
    }

    private static void multiply(int firstNumber, int secondNumber) {
        System.out.println(firstNumber * secondNumber);
    }

    private static void subtract(int firstNumber, int secondNumber) {
        System.out.println(firstNumber - secondNumber);
    }

    private static void divide(int firstNumber, int secondNumber) {
        System.out.println(firstNumber / secondNumber);
    }
}