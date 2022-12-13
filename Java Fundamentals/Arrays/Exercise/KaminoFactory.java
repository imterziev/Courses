package ProgrammingFundamentals.Arrays.Exercise;

import java.util.Scanner;

public class KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        int maxSum = 0;
        int maxLength = 0;
        int bestPosition = 0;
        int loops = 0;
        int bestDnaAtLoop = 0;

        String bestDna = "";

        String[] saveBestDna = new String[length];

        while (!input.equals("Clone them!")) {
            loops++;

            String data = input.replaceAll("!", "");
            String[] dna = data.split("0");

            int currentLength = 0;
            int currentSum = 0;
            int currentPosition = 0;

            for (int i = 0; i < dna.length; i++) {
                currentSum += dna[i].length();

                if (dna[i].length() > currentLength) {
                    currentLength = dna[i].length();
                    bestDna = dna[i];
                }
            }

            currentPosition = data.indexOf(bestDna);

            if (currentLength > maxLength) {
                maxLength = currentLength;
                maxSum = currentSum;
                bestPosition = currentPosition;
                bestDnaAtLoop = loops;
                saveBestDna = data.split("");
            } else if (currentLength == maxLength && (currentPosition < bestPosition || currentSum > maxSum)) {
                maxSum = currentSum;
                bestPosition = currentPosition;
                bestDnaAtLoop = loops;
                saveBestDna = data.split("");
            } else if (loops == 1) {
                maxLength = currentLength;
                maxSum = currentSum;
                bestPosition = currentPosition;
                bestDnaAtLoop = loops;
                saveBestDna = data.split("");
            }

            input = scanner.nextLine();
        }

        System.out.printf("Best DNA sample %d with sum: %d.%n", bestDnaAtLoop, maxSum);
        System.out.println(String.join(" ", saveBestDna));
    }
}