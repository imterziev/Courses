package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SoftUniBarIncome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String regex = "^%(?<customer>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<quantity>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.?[0-9]*)\\$";
        Pattern pattern = Pattern.compile(regex);

        String input = scanner.nextLine();
        double totalPrice = 0;

        while (!input.equals("end of shift")) {
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()) {
                double priceOfProduct = Double.parseDouble(matcher.group("price"));
                int quantityOfProduct = Integer.parseInt(matcher.group("quantity"));
                double price = priceOfProduct * quantityOfProduct;

                System.out.printf("%s: %s - %.2f\n",
                        matcher.group("customer"),
                        matcher.group("product"),
                        price);

                totalPrice += price;
            }

            input = scanner.nextLine();
        }

        System.out.printf("Total income: %.2f", totalPrice);
    }
}