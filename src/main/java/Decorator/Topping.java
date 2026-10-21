package Decorator;

public abstract class Topping implements Food {
    protected Food food;
    public Topping(Food food) {
        this.food = food;
    }
}
