package Decorator;

public class Onions extends Topping {
    public Onions(Food food) {
        super(food);
    }

    @Override
    public double calculateCost() {
        return food.calculateCost() + 0.50;
    }
}
