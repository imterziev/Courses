package ProgrammingFundamentals.ObjectsAndClasses.Exercise.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<VehicleCatalogue> vehicleCatalogueList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] data = input.split("\\s+");
            String type = data[0];
            String model = data[1];
            String color = data[2];
            int horsepower = Integer.parseInt(data[3]);

            VehicleCatalogue vehicle = new VehicleCatalogue(type, model, color, horsepower);
            vehicleCatalogueList.add(vehicle);

            input = scanner.nextLine();
        }

        while (!input.equals("Close the Catalogue")) {
            for (VehicleCatalogue vehicleCatalogue : vehicleCatalogueList) {
                if (input.equals(vehicleCatalogue.getModel())) {
                    System.out.printf("Type: %s%n", vehicleCatalogue.getType().substring(0, 1).toUpperCase() + vehicleCatalogue.getType().substring(1));
                    System.out.printf("Model: %s%n", vehicleCatalogue.getModel());
                    System.out.printf("Color: %s%n", vehicleCatalogue.getColor());
                    System.out.printf("Horsepower: %d%n", vehicleCatalogue.getHorsepower());
                }
            }

            input = scanner.nextLine();
        }

        int counterCars = 0;
        int carHorsepower = 0;
        int counterTrucks = 0;
        int truckHorsepower = 0;

        for (VehicleCatalogue vehicleCatalogue : vehicleCatalogueList) {
            if (vehicleCatalogue.getType().equals("car")) {
                counterCars++;
                carHorsepower += vehicleCatalogue.getHorsepower();
            } else {
                counterTrucks++;
                truckHorsepower += vehicleCatalogue.getHorsepower();
            }
        }

        if (counterTrucks == 0) {
            counterTrucks = 1;
        }

        if (counterCars == 0) {
            counterCars = 1;
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", (double) carHorsepower / counterCars);
        System.out.printf("Trucks have average horsepower of: %.2f.%n", (double) truckHorsepower / counterTrucks);
    }
}