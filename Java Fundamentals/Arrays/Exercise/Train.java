package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int wagons = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < wagons; i++) {
            int[] people = new int[wagons];

            people[i] = Integer.parseInt(scanner.nextLine());
            sum += people[i];

            System.out.print(people[i] + " ");
        }

        System.out.println();
        System.out.println(sum);
    }
}