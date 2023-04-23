package JavaAdvanced.WorkshopBasicAlgorithms;

import java.util.*;

public class SumOfCoins {

    public static int coinsCounter;
    public static int targetSum;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",*\\s+");
        String[] secondInput = scanner.nextLine().split("\\s+");

        int[] coins = Arrays.stream(input).skip(1).mapToInt(Integer::parseInt).toArray();
        targetSum = Integer.parseInt(secondInput[1]);

        Arrays.sort(coins);

        Map<Integer, Integer> selectedCoins = chooseCoins(coins);

        if (targetSum <= 0) {
            System.out.println("Number of coins to take: " + coinsCounter);

            selectedCoins.entrySet().stream().filter(e -> e.getValue() != 0).sorted((e1, e2) -> Integer.compare(e2.getKey(), e1.getKey()))
                    .forEach(e -> {
                        System.out.printf("%d coin(s) with value %d\n", e.getValue(), e.getKey());
                    });
        } else {
            System.out.println("Error");
        }

    }

    private static Map<Integer, Integer> chooseCoins(int[] coins) {
        Map<Integer, Integer> selectedCoins = new TreeMap<>();

        for (int i = coins.length - 1; i >= 0; i--) {
            int coin = coins[i];
            int coinsToGet = 0;

            while (coin <= targetSum) {
                targetSum -= coin;
                coinsToGet++;
                coinsCounter++;
            }

            selectedCoins.put(coin, coinsToGet);
        }

        return selectedCoins;
    }
}