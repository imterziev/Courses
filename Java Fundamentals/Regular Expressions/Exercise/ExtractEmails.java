package ProgrammingFundamentals.RegularExpressions.Exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "\\b[A-Za-z0-9]+[\\.-]?[A-Za-z0-9]+@[A-Za-z0-9]+[\\.-]?[A-Za-z0-9]+\\.?[A-Za-z0-9]+\\.?[A-Za-z0-9]+\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}