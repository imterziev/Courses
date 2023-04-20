package ProgrammingFundamentals.TextProcessing.Exercise;

import java.math.BigDecimal;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        BigDecimal bigDecimal = new BigDecimal(scanner.nextLine());
        BigDecimal number = new BigDecimal(scanner.nextLine());

        bigDecimal = bigDecimal.multiply(number);

        System.out.println(bigDecimal);
    }
}