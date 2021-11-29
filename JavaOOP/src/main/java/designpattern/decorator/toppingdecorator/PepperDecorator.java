package designpattern.decorator.toppingdecorator;

import designpattern.decorator.pizza.Pizza;

public class PepperDecorator extends PizzaDecorator {

    public PepperDecorator(Pizza currentPizza) {
        super(currentPizza);
    }

    @Override
    public String doPizza() {
        String pizzaType = currentPizza.doPizza();
        return pizzaType + addPepper();
    }

    private String addPepper() {
        return "+ Pepper ";
    }
}
