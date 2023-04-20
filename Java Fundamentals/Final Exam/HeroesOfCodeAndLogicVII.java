package ProgrammingFundamentals.FinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfHeroes = Integer.parseInt(scanner.nextLine());

        Map<String, Hero> heroCollection = new LinkedHashMap<>();

        for (int i = 1; i <= numberOfHeroes; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String nameOfHero = input[0];
            int hitPoints = Integer.parseInt(input[1]);
            int manaPoints = Integer.parseInt(input[2]);

            Hero newHero = new Hero(hitPoints, manaPoints);
            heroCollection.put(nameOfHero, newHero);
        }

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String[] commands = input.split("\\s+-\\s+");
            String action = commands[0];
            String heroName = commands[1];

            switch (action) {
                case "CastSpell":
                    int manaNeeded = Integer.parseInt(commands[2]);
                    String spellName = commands[3];

                    if (heroCollection.get(heroName).getManaPoints() >= manaNeeded) {
                        heroCollection.get(heroName).setManaPoints(heroCollection.get(heroName).getManaPoints() - manaNeeded);
                        System.out.printf("%s has successfully cast %s and now has %s MP!\n", heroName, spellName, heroCollection.get(heroName).getManaPoints());
                    } else {
                        System.out.printf("%s does not have enough MP to cast %s!\n", heroName, spellName);
                    }
                    break;
                case "TakeDamage":
                    int damage = Integer.parseInt(commands[2]);
                    String attacker = commands[3];
                    int heroHP = heroCollection.get(heroName).getHitPoints();
                    int heroHPAfterAttack = heroHP - damage;

                    if (heroHPAfterAttack > 0) {
                        heroCollection.get(heroName).setHitPoints(heroHPAfterAttack);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!\n", heroName, damage, attacker, heroHPAfterAttack);
                    } else {
                        System.out.printf("%s has been killed by %s!\n", heroName, attacker);
                        heroCollection.get(heroName).setHitPoints(0);
                    }
                    break;
                case "Recharge":
                    int amountMana = Integer.parseInt(commands[2]);
                    int heroMana = heroCollection.get(heroName).getManaPoints();
                    int manaAfterAdded = heroMana + amountMana;

                    if (manaAfterAdded > 200) {
                        heroCollection.get(heroName).setManaPoints(200);
                        int howManaRecharge = 200 - heroMana;
                        System.out.printf("%s recharged for %d MP!\n", heroName, howManaRecharge);
                    } else {
                        heroCollection.get(heroName).setManaPoints(manaAfterAdded);
                        System.out.printf("%s recharged for %d MP!\n", heroName, amountMana);
                    }
                    break;
                case "Heal":
                    int amountHP = Integer.parseInt(commands[2]);
                    int heroCurrentHP = heroCollection.get(heroName).getHitPoints();
                    int hpAfterAdded = heroCurrentHP + amountHP;

                    if (hpAfterAdded > 100) {
                        heroCollection.get(heroName).setHitPoints(100);
                        int howHPHeal = 100 - heroCurrentHP;
                        System.out.printf("%s healed for %d HP!\n", heroName, howHPHeal);
                    } else {
                        heroCollection.get(heroName).setHitPoints(hpAfterAdded);
                        System.out.printf("%s healed for %d HP!\n", heroName, amountHP);
                    }
                    break;
            }

            input = scanner.nextLine();
        }

        heroCollection.entrySet().stream()
                .filter(h -> h.getValue().getHitPoints() > 0)
                .forEach(e ->
                {
                    System.out.println(e.getKey());
                    System.out.printf("  HP: %d\n", e.getValue().getHitPoints());
                    System.out.printf("  MP: %d\n", e.getValue().getManaPoints());
                });
    }

    public static class Hero {
        int hitPoints;
        int manaPoints;

        public Hero(int hitPoints, int manaPoints) {
            this.hitPoints = hitPoints;
            this.manaPoints = manaPoints;
        }

        public int getHitPoints() {
            return hitPoints;
        }

        public void setHitPoints(int hitPoints) {
            this.hitPoints = hitPoints;
        }

        public int getManaPoints() {
            return manaPoints;
        }

        public void setManaPoints(int manaPoints) {
            this.manaPoints = manaPoints;
        }
    }
}