package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NetherRealms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> input = Arrays.stream(scanner.nextLine().split(",\\s*")).collect(Collectors.toList());

        for (int i = 0; i < input.size(); i++) {
            String healthRegex = "[^\\\\d.+\\\\/*,-]*";
            Pattern healthPattern = Pattern.compile(healthRegex);
            Matcher healthMatcher = healthPattern.matcher(input.get(i));

            StringBuilder health = new StringBuilder();

            while (healthMatcher.find()) {
                health.append(healthMatcher.group());
            }

            int totalHealth = 0;

            for (char currentChar : health.toString().toCharArray()) {
                totalHealth += currentChar;
            }

            String damageRegex = "([-]?[\\d]+[.]?[\\d]*)";
            Pattern damagePattern = Pattern.compile(damageRegex);
            Matcher damageMatcher = damagePattern.matcher(input.get(i));

            double totalDamage = 0;

            while (damageMatcher.find()) {
                totalDamage += Double.parseDouble(damageMatcher.group());
            }

            for (int j = 0; j < input.get(i).length(); j++) {
                char currentChar = input.get(i).charAt(j);

                if (currentChar == '*') {
                    totalDamage *= 2;
                } else if (currentChar == '/') {
                    totalDamage /= 2;
                }
            }

            String formatResults = String.format("%s - %d health, %.2f damage", input.get(i), totalHealth, totalDamage);

            input.set(i, formatResults);
        }

        input.stream().sorted().forEach(System.out::println);
    }
}