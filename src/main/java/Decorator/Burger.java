package Decorator;

public class Burger implements Food {
    @Override
    public double calculateCost() {
        return 8.0;
    }
}
