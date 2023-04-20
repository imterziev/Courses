package ProgrammingFundamentals.FinalExam;

import java.util.*;

public class PlantDiscovery {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countPlants = Integer.parseInt(scanner.nextLine());

        Map<String, Plants> plantsCollection = new LinkedHashMap<>();

        for (int i = 1; i <= countPlants; i++) {
            String[] data = scanner.nextLine().split("<->");
            String plant = data[0];
            int rarity = Integer.parseInt(data[1]);

            Plants newPlant = new Plants(rarity, new ArrayList<>());
            plantsCollection.put(plant, newPlant);
        }

        String input = scanner.nextLine();

        while (!input.equals("Exhibition")) {
            String[] commandsData = input.split("[:-]");
            String command = commandsData[0].trim();
            String plantName = commandsData[1].trim();

            if (!plantsCollection.containsKey(plantName)) {
                System.out.println("error");
                input = scanner.nextLine();
                continue;
            }

            switch (command) {
                case "Rate":
                    int rating = Integer.parseInt(commandsData[2].trim());
                    plantsCollection.get(plantName).addRating(rating);
                    break;
                case "Update":
                    int newRarity = Integer.parseInt(commandsData[2].trim());
                    plantsCollection.get(plantName).setRarity(newRarity);
                    break;
                case "Reset":
                    plantsCollection.get(plantName).removeAllRating();
                    break;
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");
        plantsCollection.entrySet().stream().forEach(p -> {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f\n", p.getKey(), p.getValue().getRarity(), p.getValue().getAverageRating());
        });
    }

    public static class Plants {
        private int rarity;
        private List<Integer> ratings;

        public Plants(int rarity, List<Integer> rating) {
            this.rarity = rarity;
            this.ratings = rating;
        }

        public void addRating(int rating) {
            ratings.add(rating);
        }

        public void removeAllRating() {
            this.ratings.clear();
        }

        public void setRarity(int rarity) {
            this.rarity = rarity;
        }

        public int getRarity() {
            return rarity;
        }

        public double getAverageRating() {
            double sumOfAllRatings = 0;

            for (Integer rating : ratings) {
                sumOfAllRatings += rating;
            }

            if (sumOfAllRatings == 0) {
                return 0;
            } else {
                return sumOfAllRatings / this.ratings.size();
            }
        }
    }
}