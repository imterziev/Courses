package ProgrammingFundamentals.FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FancyBarcodes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String barcodeRegex = "@#+[A-Z][A-Za-z0-9]{4,}[A-Z]@#+";
        Pattern barcodePattern = Pattern.compile(barcodeRegex);

        String groupRegex = "[0-9]";
        Pattern groupPattern = Pattern.compile(groupRegex);

        int numberProducts = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numberProducts; i++) {
            String input = scanner.nextLine();

            Matcher barcodeMatcher = barcodePattern.matcher(input);

            if (barcodeMatcher.find()) {
                Matcher groupMatcher = groupPattern.matcher(input);
                StringBuilder group = new StringBuilder();

                while (groupMatcher.find()) {
                    group.append(groupMatcher.group());
                }

                if (group.toString().equals("")) {
                    System.out.println("JavaOOP.Inheritance.Exercise.Restaurant.Product group: 00");
                } else {
                    System.out.printf("JavaOOP.Inheritance.Exercise.Restaurant.Product group: %s\n", group);
                }
            } else {
                System.out.println("Invalid barcode");
            }
        }
    }
}