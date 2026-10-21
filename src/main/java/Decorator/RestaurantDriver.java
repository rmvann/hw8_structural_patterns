package Decorator;

public class RestaurantDriver {
    public static void main(String[] args) {
        Order order = new Order();
        Food burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);
        Food fries = new Fries();
        fries = new Ketchup(fries);

        order.addFood(burger);
        order.addFood(fries);

        LoyaltyStatus loyaltyStatus = LoyaltyStatus.SILVER;
        double cost = loyaltyStatus.applyDiscount(order.calculateCost());

        System.out.println("Order cost: " + cost);
    }
}
