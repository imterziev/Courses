package ProgrammingFundamentals.DataTypesAndVariables.Exercise;

import java.util.Scanner;

public class PrintPartOfTheASCIITable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int startNumber = Integer.parseInt(scanner.nextLine());
        int finalNumber = Integer.parseInt(scanner.nextLine());

        for (int i = startNumber; i <= finalNumber; i++) {
            char ascii = (char) i;
            System.out.print(ascii + " ");
        }
    }
}