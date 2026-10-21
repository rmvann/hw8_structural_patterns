package Decorator;

public class Ketchup extends Topping {
    public Ketchup(Food food) {
        super(food);
    }

    @Override
    public double calculateCost() {
        return food.calculateCost() + 0.10;
    }
}
