package PizzaBillGenrator;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int delivery = 20;
    private int basePizzaPrice;
    private boolean isExtraCheese ;
    private boolean isExtraToppings;
    private boolean isDelivery;

    public Pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        this.basePizzaPrice = this.price;
    }

    public void extraCheese() {
        this.isExtraCheese = true;
        this.basePizzaPrice += extraCheesePrice;
    }

    public void extraToppings(){
        this.isExtraToppings = true;
        this.basePizzaPrice += extraToppingsPrice;
    }

    public void takeAway(){
        this.isDelivery = true;
        this.basePizzaPrice +=delivery; 
    }

    public void getBill(){
        System.out.println(this.basePizzaPrice);
    }

}
