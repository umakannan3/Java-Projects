package PizzaBillGenrator;

public class Pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int delivery = 20;
    private int basePizzaPrice;
    private boolean isExtraCheese = false ;
    private boolean isExtraToppings = false;
    private boolean isDelivery = false;

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
        this.price += extraCheesePrice;
    }

    public void extraToppings(){
        this.isExtraToppings = true;
        this.price += extraToppingsPrice;
    }

    public void takeAway(){
        this.isDelivery = true;
        this.price +=delivery; 
    }

    public void getBill(){
        String bill = "";
        System.out.println("Price of BasePizza : " +basePizzaPrice);
        if(isExtraCheese){
            bill += "Extra Cheese Added : " +extraCheesePrice + "\n";
        }
        if(isExtraToppings){
            bill += "Extra Toppings Added : " +extraToppingsPrice + "\n";
        }
        if(isDelivery){
            bill += "Delivery charges Added : " +delivery + "\n";
        }
        bill += "Bill : " +this.price + "\n";
        System.out.println(bill);
    }

}
