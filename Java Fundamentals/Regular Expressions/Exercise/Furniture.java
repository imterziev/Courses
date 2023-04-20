package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        List<String> items = new ArrayList<>();
        double totalPrice = 0;

        String regex = ">>(?<product>[A-Za-z]+)<<(?<price>\\d+\\.?\\d*)\\!(?<quantity>\\d+)\\b";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("Purchase")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                String item = matcher.group("product");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                items.add(item);
                totalPrice += price * quantity;
            }

            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        items.stream().forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}