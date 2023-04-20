package ProgrammingFundamentals.ObjectsAndClasses.Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());

        List<Songs> songList = new ArrayList<>();

        for (int i = 1; i <= numberOfSongs; i++) {
            String[] input = scanner.nextLine().split("\\_");

            String type = input[0];
            String name = input[1];
            String time = input[2];

            Songs songs = new Songs(type, name, time);
            songList.add(songs);
        }

        String typeOfPlaylist = scanner.nextLine();

        if (typeOfPlaylist.equals("all")) {
            for (Songs songs : songList) {
                System.out.println(songs);
            }
        } else {
            for (Songs songs : songList) {
                if (songs.getType().equals(typeOfPlaylist)) {
                    System.out.println(songs);
                }
            }
        }
    }
}