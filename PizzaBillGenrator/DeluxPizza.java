package PizzaBillGenrator;
 
public class DeluxPizza extends Pizza{
    public DeluxPizza(boolean veg){
        super(veg);
        super.extraCheese();
        super.extraToppings();
    }

    public void extraCheese() {}

    public void extraToppings() {}
}
