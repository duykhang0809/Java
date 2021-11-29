package designpattern.decorator.toppingdecorator;

import designpattern.decorator.pizza.Pizza;

public abstract class PizzaDecorator implements Pizza {

    protected Pizza currentPizza;

    public PizzaDecorator(Pizza newPizza) {
        currentPizza = newPizza;
    }

    public Pizza getPizza() {
        return currentPizza;
    }

    public void setPizza(Pizza pizza) {
        this.currentPizza = pizza;
    }
}
