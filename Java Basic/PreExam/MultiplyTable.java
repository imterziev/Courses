package ProgrammingBasic.PreExam;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int left = number;
        int num = 0;
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int result = 0;

        num = left % 10;
        num1 += num;
        left /= 10;

        num = left % 10;
        num2 += num;
        left /= 10;

        num = left % 10;
        num3 += num;
        left /= 10;

        for (int i = 1; i <= num1; i++) {

            for (int j = 1; j <= num2; j++) {

                for (int k = 1; k <= num3; k++) {

                    result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }
        }
    }
}