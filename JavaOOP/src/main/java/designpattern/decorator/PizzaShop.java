package designpattern.decorator;


import designpattern.decorator.pizza.ChickenPizza;
import designpattern.decorator.pizza.Pizza;
import designpattern.decorator.pizza.TomatoPizza;
import designpattern.decorator.toppingdecorator.CheeseDecorator;
import designpattern.decorator.toppingdecorator.PepperDecorator;

public class PizzaShop {
    public static void main(String[] args) {
        Pizza tomatoPizza = new TomatoPizza();
        Pizza chickenPizza = new ChickenPizza();

        System.out.println(tomatoPizza.doPizza());
        System.out.println(chickenPizza.doPizza());

        // Use Decorator pattern to extend existing pizza dynamically

        // Add pepper to tomato-pizza
        PepperDecorator pepperToPizza = new PepperDecorator(tomatoPizza);
        System.out.println(pepperToPizza.doPizza());

        // Add cheese to tomato-pizza
        CheeseDecorator cheeseToPizza = new CheeseDecorator(tomatoPizza);
        System.out.println(cheeseToPizza.doPizza());

        // Add cheese and pepper to tomato-pizza
        CheeseDecorator cheeseToAnotherPizza = new CheeseDecorator(pepperToPizza);
        System.out.println(cheeseToAnotherPizza.doPizza());
    }
}
