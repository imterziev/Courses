package JavaAdvanced.DefiningClasses.Exercise.PokémonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
    }

    public void addBadges() {
        badges++;
    }

    public void missingPokemon() {
        for (int i = 0; i < pokemons.size(); i++) {
            Pokemon currentPokemon = pokemons.get(i);

            currentPokemon.lowerHealth();

            if (currentPokemon.getHealth() <= 0) {
                pokemons.remove(currentPokemon);
                i--;
            }
        }
    }


    @Override
    public String toString() {
        return String.format("%s %d %d", name, badges, pokemons.size());
    }
}