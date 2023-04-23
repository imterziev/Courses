package JavaAdvanced.FinalExam.Guild;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Guild {
    private String name;
    private int capacity;
    private Map<String, Player> roster;

    public Guild(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.roster = new LinkedHashMap<>();
    }

    public void addPlayer(Player player) {
        if (this.capacity > this.roster.size()) {
            this.roster.put(player.getName(), player);
        }
    }

    public boolean removePlayer(String name) {
        return this.roster.remove(name) != null;
    }

    public void promotePlayer(String name) {
        this.roster.get(name).setRank("Member");
    }

    public void demotePlayer(String name) {
        this.roster.get(name).setRank("Trial");
    }

    public Player[] kickPlayersByClass(String clazz) {
        Player[] players = new Player[this.roster.size()];

        int i = 0;

        for (var entry : this.roster.entrySet()) {
            if (entry.getValue().getClazz().equals(clazz)) {
                players[i++] = entry.getValue();
            }
        }

        for (int j = 0; j < i; j++) {
            this.roster.remove(players[j].getName());
        }

        return Arrays.copyOfRange(players, 0, i);
    }

    public int count() {
        return this.roster.size();
    }

    public String report() {
        StringBuilder stringBuilder = new StringBuilder(
                String.format("Players in the guild: %s:%n", name));

        for (Player p : roster.values()) {
            stringBuilder.append(p).append(System.lineSeparator());
        }

        return stringBuilder.toString().trim();
    }
}