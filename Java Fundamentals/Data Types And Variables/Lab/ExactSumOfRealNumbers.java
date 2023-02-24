package ProgrammingFundamentals.DataTypesAndVariables.Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = new BigDecimal(0);

        for (int i = 1; i <= num; i++) {
            BigDecimal numbers = new BigDecimal(scanner.nextLine());

            sum = sum.add(numbers);
        }

        System.out.println(sum);
    }
}