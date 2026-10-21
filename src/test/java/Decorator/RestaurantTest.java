package Decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class RestaurantTest {
    @Test
    void testBurger(){
        Food burger = new Burger();
        double expected = 8.0;
        double actual = burger.calculateCost();
        assertEquals(expected,actual);
    }

    @Test
    void testFries() {
        Food fries = new Fries();
        double expected = 3.0;
        double actual = fries.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testHotDog() {
        Food hotDog = new HotDog();
        double expected = 6.0;
        double actual = hotDog.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testKetchup() {
        Food hotDog = new HotDog();
        hotDog = new Ketchup(hotDog);
        double expected = 6.1;
        double actual = hotDog.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testCheese() {
        Food burger = new Burger();
        burger = new Cheese(burger);
        double expected = 8.25;
        double actual = burger.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testOnions() {
        Food burger = new Burger();
        burger = new Onions(burger);
        double expected = 8.5;
        double actual = burger.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testOrder(){
        Order order = new Order();
        Food burger = new Burger();
        burger = new Cheese(burger);
        burger = new Onions(burger);
        Food fries = new Fries();
        fries = new Ketchup(fries);

        order.addFood(burger);
        order.addFood(fries);

        double expected = 11.85;
        double actual = order.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    void testLoyalty(){
        Food burger = new Burger();
        LoyaltyStatus loyaltyStatus = LoyaltyStatus.GOLD;
        double expected = 7.2;
        double actual = loyaltyStatus.applyDiscount(burger.calculateCost());
        assertEquals(expected, actual);
    }
}
