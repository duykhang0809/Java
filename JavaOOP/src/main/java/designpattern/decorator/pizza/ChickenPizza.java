package designpattern.decorator.pizza;

public class ChickenPizza implements Pizza {
    @Override
    public String doPizza() {
        return "Order Chicken Pizza ";
    }
}
