package JavaAdvanced.FinalExam.Guild;

public class Main {
    public static void main(String[] args) {

        Guild guild = new Guild("Weekend Raiders", 20);
        Player player = new Player("Mark", "Rogue");
        System.out.println(player);

        guild.addPlayer(player);
        System.out.println(guild.count());
        System.out.println(guild.removePlayer("George"));

        Player firstPlayer = new Player("Pep", "Warrior");
        Player secondPlayer = new Player("Lizzy", "Priest");
        Player thirdPlayer = new Player("Mike", "Rogue");
        Player fourthPlayer = new Player("Marlin", "Mage");

        secondPlayer.setDescription("Best healer EU");

        guild.addPlayer(firstPlayer);
        guild.addPlayer(secondPlayer);
        guild.addPlayer(thirdPlayer);
        guild.addPlayer(fourthPlayer);

        guild.promotePlayer("Lizzy");

        System.out.println(guild.removePlayer("Pep")); //true

        Player[] kickedPlayers = guild.kickPlayersByClass("Rogue");
        for (Player kickedPlayer : kickedPlayers) {
            System.out.print(kickedPlayer.getName() + " ");
        }

        System.out.println();

        System.out.println(guild.report());
    }
}