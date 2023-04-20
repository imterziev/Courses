package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfMessages = Integer.parseInt(scanner.nextLine());

        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 1; i <= numberOfMessages; i++) {
            String input = scanner.nextLine();

            int counter = 0;

            for (int j = 0; j < input.length(); j++) {
                char currentChar = input.toLowerCase().charAt(j);

                switch (currentChar) {
                    case 's':
                    case 't':
                    case 'a':
                    case 'r':
                        counter++;
                        input.replace(String.valueOf(input.charAt(j)), "");
                        break;
                }
            }

            String currentWord = "";

            for (int j = 0; j < input.length(); j++) {
                char inputChar = input.charAt(j);

                inputChar -= counter;

                currentWord += inputChar;
            }

            String regex = "\\@(?<name>[A-Z][a-z]+)([^-@!:>])*" +
                    "\\:(?<population>\\d*)([^-@!:>])*" +
                    "\\!(?<attack>A|D)\\!([^-@!:>])*" +
                    "\\-\\>(?<soldiers>\\d*)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(currentWord);

            if (matcher.find()) {
                if (matcher.group("attack").equals("A")) {
                    attacked.add(matcher.group("name"));
                } else if (matcher.group("attack").equals("D")) {
                    destroyed.add(matcher.group("name"));
                }
            }
        }

        System.out.printf("Attacked planets: %d\n", attacked.size());
        attacked.stream().sorted().forEach(e -> System.out.printf("-> %s\n", e));

        System.out.printf("Destroyed planets: %d\n", destroyed.size());
        destroyed.stream().sorted().forEach(e -> System.out.printf("-> %s\n", e));
    }
}