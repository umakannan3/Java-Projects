package PizzaBillGenrator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza(false);
        pizza.extraCheese();
        pizza.extraToppings();
        pizza.takeAway();
        pizza.getBill();

        DeluxPizza dPizza = new DeluxPizza(true);
        dPizza.takeAway();
        dPizza.getBill();
    }
}
