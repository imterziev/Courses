package ProgrammingBasic.NestedLoops.Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();

        String tickets = "";
        int seats = 0;
        double saloon = 0;
        int totalTicket = 0;
        int countTicket = 0;
        double kid = 0;
        double student = 0;
        double standard = 0;

        while (!movie.equals("Finish")) {
            seats = Integer.parseInt(scanner.nextLine());

            tickets = scanner.nextLine();

            while (!tickets.equals("End")) {

                totalTicket++;

                switch (tickets) {
                    case "kid":
                        kid++;
                        break;
                    case "student":
                        student++;
                        break;
                    case "standard":
                        standard++;
                        break;
                }

                if (totalTicket == seats) {
                    break;
                }
                tickets = scanner.nextLine();
            }

            saloon = (totalTicket / (seats * 1.00)) * 100.00;
            countTicket += totalTicket;

            System.out.printf("%s - %.2f%% full.%n", movie, saloon);

            totalTicket = 0;

            movie = scanner.nextLine();
        }

        kid = kid / countTicket * 100;
        student = student / countTicket * 100;
        standard = standard / countTicket * 100;

        System.out.printf("Total tickets: %d%n", countTicket);
        System.out.printf("%.2f%% student tickets.%n", student);
        System.out.printf("%.2f%% standard tickets.%n", standard);
        System.out.printf("%.2f%% kids tickets.%n", kid);
    }
}