package ProgrammingFundamentals.ObjectsAndClasses.Exercise.Articles2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Articles> articlesList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String[] data = scanner.nextLine().split(",\\s+");
            String title = data[0];
            String content = data[1];
            String author = data[2];

            Articles article = new Articles(title, content, author);
            articlesList.add(article);
        }

        String command = scanner.nextLine();

        switch (command) {
            case "title":
                articlesList.sort(Comparator.comparing(Articles::getTitle));
                break;
            case "content":
                articlesList.sort(Comparator.comparing(Articles::getContent));
                break;
            case "author":
                articlesList.sort(Comparator.comparing(Articles::getAuthor));
                break;
        }

        for (Articles articles : articlesList) {
            System.out.println(articles);
        }
    }
}