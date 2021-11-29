package designpattern.decorator.pizza;

public class TomatoPizza implements Pizza {
    @Override
    public String doPizza() {
        return "Order Tomato Pizza ";
    }
}
