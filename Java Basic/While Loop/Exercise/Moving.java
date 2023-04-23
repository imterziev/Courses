package ProgrammingBasic.WhileLoop.Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length * height;
        String input = "0";

        while (!(input.equals("Done"))) {
            int box = Integer.parseInt(input);

            volume -= box;

            if (volume <= 0) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volume));
                break;
            }

            input = scanner.nextLine();
        }

        if (input.equals("Done")) {
            System.out.printf("%d Cubic meters left.", volume);
        }
    }
}