package ProgrammingFundamentals.DataTypesAndVariables.Lab;

import java.util.Scanner;

public class RefactorVolumeOfPyramid {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Length: ");
        double length = Double.parseDouble(scanner.nextLine());

        System.out.print("Width: ");
        double width = Double.parseDouble(scanner.nextLine());

        System.out.print("Height: ");
        double heigh = Double.parseDouble(scanner.nextLine());

        double volume = (length * width * heigh) / 3;

        System.out.printf("Pyramid Volume: %.2f", volume);
    }
}