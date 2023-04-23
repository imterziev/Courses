package JavaOOP.WorkingWithAbstraction.Lab.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] points = readArray(scanner);

        Point pointA = new Point(points[0], points[1]);
        Point pointB = new Point(points[2], points[3]);

        Rectangle rectangle = new Rectangle(pointA, pointB);

        int checkPoints = Integer.parseInt(scanner.nextLine());

        while (checkPoints-- > 0) {
            int[] pointToCheck = readArray(scanner);

            Point checkPoint = new Point(pointToCheck[0], pointToCheck[1]);

            System.out.println(rectangle.contains(checkPoint));
        }
    }

    private static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }
}