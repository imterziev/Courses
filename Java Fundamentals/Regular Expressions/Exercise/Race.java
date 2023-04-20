package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] participants = scanner.nextLine().split(", ");

        Map<String, Integer> raceData = new LinkedHashMap<>();

        for (String name : participants) {
            raceData.put(name, 0);
        }

        String nameRegex = "[A-Za-z]";
        String kmRegex = "\\d";

        Pattern name = Pattern.compile(nameRegex);
        Pattern kilometers = Pattern.compile(kmRegex);

        String input = scanner.nextLine();

        while (!input.equals("end of race")) {
            Matcher nameMatch = name.matcher(input);

            String currentName = "";

            while (nameMatch.find()) {
                currentName += nameMatch.group();
            }

            if (raceData.containsKey(currentName)) {
                Matcher kmMatch = kilometers.matcher(input);
                int km = 0;

                while (kmMatch.find()) {
                    km += Integer.parseInt(kmMatch.group());
                }

                raceData.put(currentName, raceData.get(currentName) + km);
            }

            input = scanner.nextLine();
        }

        List<String> results = raceData.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3).map(Map.Entry::getKey).collect(Collectors.toList());

        System.out.println("1st place: " + results.get(0));
        System.out.println("2nd place: " + results.get(1));
        System.out.println("3rd place: " + results.get(2));
    }
}