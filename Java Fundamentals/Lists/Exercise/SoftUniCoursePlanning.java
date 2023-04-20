package ProgrammingFundamentals.Lists.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lessons = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String[] commands = input.split(":");

            switch (commands[0]) {
                case "Add":
                    if (!lessons.contains(commands[1])) {
                        lessons.add(commands[1]);
                    }
                    break;
                case "Insert":
                    if (!lessons.contains(commands[1])) {
                        if (Integer.parseInt(commands[2]) >= 0 && Integer.parseInt(commands[2]) <= lessons.size()) {
                            lessons.add(Integer.parseInt(commands[2]), commands[1]);
                        }
                    }
                    break;
                case "Remove":
                    if (lessons.contains(commands[1])) {
                        lessons.remove(commands[1]);
                        lessons.remove(commands[1] + "-Exercise");
                    }
                    break;
                case "Swap":
                    if (lessons.contains(commands[1]) && lessons.contains(commands[2])) {
                        int firstLesson = lessons.indexOf(commands[1]);
                        int secondLesson = lessons.indexOf(commands[2]);

                        Collections.swap(lessons, firstLesson, secondLesson);

                        if (lessons.contains(commands[1] + "-Exercise")) {
                            lessons.remove(commands[1] + "-Exercise");
                            lessons.add(lessons.indexOf(commands[1]) + 1, commands[1] + "-Exercise");
                        }

                        if (lessons.contains(commands[2] + "-Exercise")) {
                            lessons.remove(commands[2] + "-Exercise");
                            lessons.add(lessons.indexOf(commands[2]) + 1, commands[2] + "-Exercise");
                        }
                    }
                    break;
                case "Exercise":
                    if (lessons.contains(commands[1]) && !lessons.contains(commands[1] + "-Exercise")) {
                        lessons.add(lessons.indexOf(commands[1]) + 1, commands[1] + "-Exercise");
                    } else if (!lessons.contains(commands[1])) {
                        lessons.add(commands[1]);
                        lessons.add(commands[1] + "-Exercise");
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < lessons.size(); i++) {
            System.out.println(i + 1 + "." + lessons.get(i));
        }
    }
}