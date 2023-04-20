package JavaAdvanced.MultidimensionalArrays.Exercise;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int playerRow = 7;
        int playerCol = 7;

        int playerHP = 18500;
        double heiganHP = 3000000;

        double playerDamage = Double.parseDouble(scanner.nextLine());

        String lastSpell = "";

        while (true) {
            if (playerHP >= 0) {
                heiganHP -= playerDamage;
            }

            if (lastSpell.equals("Cloud")) {
                playerHP -= 3500;
            }

            if (heiganHP <= 0 || playerHP <= 0) {
                break;
            }

            String[] attackData = scanner.nextLine().split("\\s+");
            String spell = attackData[0];
            int targetRow = Integer.parseInt(attackData[1]);
            int targetCol = Integer.parseInt(attackData[2]);

            if (isInDamageArea(targetRow, targetCol, playerRow, playerCol)) {
                if (!isInDamageArea(targetRow, targetCol, playerRow - 1, playerCol) && !isWall(playerRow - 1)) {
                    playerRow--;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow, playerCol + 1) && !isWall(playerCol + 1)) {
                    playerCol++;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow + 1, playerCol) && !isWall(playerRow + 1)) {
                    playerRow++;
                    lastSpell = "";
                } else if (!isInDamageArea(targetRow, targetCol, playerRow, playerCol - 1) && !isWall(playerCol - 1)) {
                    playerCol--;
                    lastSpell = "";
                } else {
                    if (spell.equals("Cloud")) {
                        playerHP -= 3500;
                        lastSpell = "Cloud";
                    } else if (spell.equals("Eruption")) {
                        playerHP -= 6000;
                        lastSpell = "Eruption";
                    }
                }
            }
        }

        lastSpell = lastSpell.equals("Cloud") ? "Plague Cloud" : "Eruption";

        String heiganState = heiganHP <= 0 ? "Heigan: Defeated!" : String.format("Heigan: %.2f", heiganHP);

        String playerState = playerHP <= 0 ? String.format("Player: Killed by %s", lastSpell) : String.format("Player: %d", playerHP);

        String lastCoordinates = String.format("Final position: %d, %d", playerRow, playerCol);

        System.out.println(heiganState);
        System.out.println(playerState);
        System.out.println(lastCoordinates);
    }

    private static boolean isWall(int moveCell) {
        return moveCell < 0 || moveCell >= 15;
    }

    private static boolean isInDamageArea(int targetRow, int targetCol, int playerRow, int playerCol) {
        return ((targetRow - 1 <= playerRow && playerRow <= targetRow + 1)
                && (targetCol - 1 <= playerCol && playerCol <= targetCol + 1));
    }
}