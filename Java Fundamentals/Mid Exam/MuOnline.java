package ProgrammingFundamentals.MidExam;

import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] rooms = scanner.nextLine().split("\\|");

        int health = 100;
        int bitcoins = 0;
        int room = 0;

        for (int i = 0; i < rooms.length; i++) {
            room = i + 1;

            String[] commands = rooms[i].split("\\s+");

            switch (commands[0]) {
                case "potion":
                    if (health < 100) {
                        int healthNeeded = Integer.parseInt(commands[1]);

                        if (health + Integer.parseInt(commands[1]) > 100) {
                            healthNeeded = 100 - health;
                        }

                        health += healthNeeded;
                        System.out.printf("You healed for %s hp.%n", healthNeeded);
                    }

                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    bitcoins += Integer.parseInt(commands[1]);
                    System.out.printf("You found %s bitcoins.%n", commands[1]);
                    break;
                default:
                    health -= Integer.parseInt(commands[1]);

                    if (health > 0) {
                        System.out.printf("You slayed %s.%n", commands[0]);
                    }
                    break;
            }

            if (health <= 0) {
                System.out.printf("You died! Killed by %s.%n", commands[0]);
                System.out.printf("Best room: %d%n", room);
                break;
            }
        }

        if (health > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", health);
        }
    }
}