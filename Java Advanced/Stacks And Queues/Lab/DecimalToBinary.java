package JavaAdvanced.StacksAndQueues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> binaryStack = new ArrayDeque<>();

        int decimal = Integer.parseInt(scanner.nextLine());

        while (decimal != 0) {
            binaryStack.push(decimal % 2);
            decimal /= 2;
        }

        if (binaryStack.isEmpty()) {
            System.out.println(0);
        } else {
            for (Integer integer : binaryStack) {
                System.out.print(integer);
            }
        }
    }
}