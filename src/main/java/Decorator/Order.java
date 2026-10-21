package Decorator;

import java.util.ArrayList;

public class Order {
    private ArrayList<Food> foodItems = new ArrayList<>();

    public void addFood(Food food) {
        foodItems.add(food);
    }

    public double calculateCost() {
        double total = 0.0;
        for (Food food : foodItems) {
            total += food.calculateCost();
        }
        return total;
    }
}
