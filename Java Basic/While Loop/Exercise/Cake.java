package ProgrammingBasic.WhileLoop.Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cake = width * length;
        int leftCake = cake;

        while (leftCake >= 0) {
            String takenPiece = scanner.nextLine();

            if (takenPiece.equals("STOP")) {
                System.out.printf("%d pieces are left.", leftCake);
                break;
            }

            int takenPieceOfCake = Integer.parseInt(takenPiece);

            leftCake -= takenPieceOfCake;
        }

        if (leftCake <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(leftCake));
        }
    }
}