package PizzaBillGenrator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        pizza.extraCheese();
        pizza.extraToppings();
        pizza.takeAway();
        pizza.getBill();
    }
}
