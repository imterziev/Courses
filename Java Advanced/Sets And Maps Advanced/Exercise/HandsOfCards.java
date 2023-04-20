package JavaAdvanced.SetsAndMapsAdvanced.Exercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class HandsOfCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Map<String, Integer>> scores = new LinkedHashMap<>();

        String regex = "(?<power>[0-9A-Z]+)(?<type>[A-Z])";
        Pattern pattern = Pattern.compile(regex);

        while (!input.equals("JOKER")) {
            String[] tokens = input.split(":\\s+");
            String nameOfPlayer = tokens[0];
            Set<String> cards = Arrays.stream(tokens[1].split(",\\s+"))
                    .collect(Collectors.toCollection(LinkedHashSet::new));

            scores.putIfAbsent(nameOfPlayer, new HashMap<>());

            getScore(scores, pattern, nameOfPlayer, cards);

            input = scanner.nextLine();
        }

        scores.entrySet().stream()
                .forEach(e -> {
                    System.out.printf("%s: ", e.getKey());

                    int result = e.getValue().values().stream().mapToInt(i -> i).sum();

                    System.out.printf("%d\n", result);
                });
    }

    private static void getScore(Map<String, Map<String, Integer>> scores, Pattern pattern, String nameOfPlayer, Set<String> cards) {
        for (String card : cards) {
            Matcher matcher = pattern.matcher(card);
            String power = "";
            String type = "";

            if (matcher.find()) {
                power = matcher.group("power");
                type = matcher.group("type");
            }

            int powerOfCard = 0;

            switch (power) {
                case "J":
                    powerOfCard = 11;
                    break;
                case "Q":
                    powerOfCard = 12;
                    break;
                case "K":
                    powerOfCard = 13;
                    break;
                case "A":
                    powerOfCard = 14;
                    break;
                default:
                    powerOfCard = Integer.parseInt(power);
                    break;
            }

            switch (type) {
                case "C":
                    powerOfCard *= 1;
                    break;
                case "D":
                    powerOfCard *= 2;
                    break;
                case "H":
                    powerOfCard *= 3;
                    break;
                case "S":
                    powerOfCard *= 4;
                    break;
            }

            scores.get(nameOfPlayer).putIfAbsent(card, powerOfCard);
        }
    }
}