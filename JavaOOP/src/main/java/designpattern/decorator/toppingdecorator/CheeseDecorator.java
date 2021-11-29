package designpattern.decorator.toppingdecorator;


import designpattern.decorator.pizza.Pizza;

public class CheeseDecorator extends PizzaDecorator {

    public CheeseDecorator(Pizza currentPizza) {
        super(currentPizza);
    }


    @Override
    public String doPizza() {
        String pizzaType = currentPizza.doPizza();
        return pizzaType + addCheese();
    }

    private String addCheese() {
        return "+ Cheese ";
    }
}
