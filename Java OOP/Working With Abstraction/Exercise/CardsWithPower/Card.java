package JavaOOP.WorkingWithAbstraction.Exercises.CardsWithPower;

public class Card {
    private RankPower rank;
    private SuitPower suite;

    public Card(RankPower rank, SuitPower suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public int getPower() {
        return rank.getPower() + suite.getPower();
    }

    @Override
    public String toString() {
        return String.format("Card name: %s of %s; Card power: %d",
                this.rank, this.suite, getPower());
    }
}