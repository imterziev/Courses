package JavaAdvanced.DefiningClasses.Exercise.PokémonTrainer;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Trainer> trainers = new LinkedHashMap<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String pokemonElement = tokens[2];
            int pokemonHealth = Integer.parseInt(tokens[3]);

            Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);

            Trainer trainer = new Trainer(trainerName);

            trainers.putIfAbsent(trainerName, trainer);
            trainers.get(trainerName).addPokemon(pokemon);

            input = scanner.nextLine();
        }

        String elements = scanner.nextLine();

        while (!elements.equals("End")) {
            for (Map.Entry<String, Trainer> entry : trainers.entrySet()) {
                if (entry.getValue().getPokemons().size() > 0) {
                    boolean havePokemon = false;

                    for (Pokemon pokemon : entry.getValue().getPokemons()) {
                        if (pokemon.getElement().equals(elements)) {
                            havePokemon = true;
                            entry.getValue().addBadges();

                            break;
                        }
                    }

                    if (!havePokemon) {
                        entry.getValue().missingPokemon();
                    }

                }
            }

            elements = scanner.nextLine();
        }

        trainers.values().stream()
                .sorted(Comparator.comparing(Trainer::getBadges).reversed())
                .forEach(System.out::println);
    }
}