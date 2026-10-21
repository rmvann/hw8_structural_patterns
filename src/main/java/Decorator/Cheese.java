package Decorator;

public class Cheese extends Topping {
    public Cheese(Food food) {
        super(food);
    }

    @Override
    public double calculateCost() {
        return food.calculateCost() + 0.25;
    }
}
