package JavaOOP.WorkingWithAbstraction.Lab.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int days;
    private Seasons seasons;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int days, Seasons seasons, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.days = days;
        this.seasons = seasons;
        this.discountType = discountType;
    }

    public double calculate() {
        int multiplier = seasons.getMultiplier();
        double discount = discountType.getDiscount();

        return this.pricePerDay * this.days * multiplier * discount;
    }

    @Override
    public String toString() {
        return String.format("%.2f", calculate());
    }
}