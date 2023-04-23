package ProgrammingBasic.ForLoop.Lab;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= count; i++) {
            int numbers = Integer.parseInt(scanner.nextLine());
            sum += numbers;
        }
        System.out.println(sum);
    }
}