package JavaOOP.WorkingWithAbstraction.Exercises.CardSuit;

public class Main {
    public static void main(String[] args) {
        System.out.println("Card Suits:");

        for (CardSuit value : CardSuit.values()) {
            System.out.printf("Ordinal value: %d; Name value: %s\n", value.ordinal(), value);
        }
    }
}