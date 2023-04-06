package assignment02.Decorator;

public class ThreeCheesePizza extends PlainPizza{

    private String description = "Mozzarella, Fontina, Parmesan Cheese Pizza";
    private double cost = 10.50;

    public String getDescription() {
        return description;
    }

    public double getCost() {
        return cost;
    }
}
