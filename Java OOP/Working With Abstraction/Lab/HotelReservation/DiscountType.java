package JavaOOP.WorkingWithAbstraction.Lab.HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SECOND_VISIT(0.9),
    NONE(1);

    private double discount;

    DiscountType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public static DiscountType fromString(String discountAsString) {
        return switch (discountAsString) {
            case "VIP" -> VIP;
            case "SecondVisit" -> SECOND_VISIT;
            case "None" -> NONE;
            default -> throw new IllegalArgumentException("Unknown discount type " + discountAsString);
        };
    }
}