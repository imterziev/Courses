package ProgrammingFundamentals.ObjectsAndClasses.Exercise.Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String title = input[0];
        String content = input[1];
        String author = input[2];

        Articles article = new Articles(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String tokens = scanner.nextLine();
            String firstCommand = tokens.split(": ")[0];
            String secondCommand = tokens.split(": ")[1];

            switch (firstCommand) {
                case "Edit":
                    article.setContent(secondCommand);
                    break;
                case "ChangeAuthor":
                    article.setAuthor(secondCommand);
                    break;
                case "Rename":
                    article.setTitle(secondCommand);
                    break;
            }
        }

        System.out.println(article);
    }
}