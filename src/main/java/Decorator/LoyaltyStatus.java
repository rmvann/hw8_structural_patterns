package Decorator;

public enum LoyaltyStatus {
    NONE(0.00),
    SILVER(0.05),
    GOLD(0.10);

    private final double discount;

    private LoyaltyStatus(double discount){
        this.discount = discount;
    }

    public double applyDiscount(double initial_total){
        return initial_total - (discount * initial_total);
    }
}
