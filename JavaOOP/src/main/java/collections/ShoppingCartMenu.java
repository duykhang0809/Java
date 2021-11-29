package collections;

import util.Validator;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartMenu {

    List<Item> cart = new ArrayList<>();
    ShoppingCart yourCart = new ShoppingCart();

    public void action() {
        yourCart.setCart(cart);
        int selection;
        while (true) {
            do {
                viewMenuCart();
                System.out.println("Enter your selection:");
                selection = Validator.inputTypeInt();
                switch (selection) {
                    case 1: {
                        System.out.println("Enter name of item:");
                        String name = Validator.inputTypeString();
                        System.out.println("Enter price of item:");
                        long price = Validator.inputTypeLong();
                        System.out.println("Enter quantity of item:");
                        int quantity = Validator.inputTypeInt();
                        yourCart.addToCart(new Item(name, price, quantity));
                        System.out.println("Add item to your cart successfully");
                        System.out.println("Total price: +" + yourCart.getTotalPrice());
                        break;
                    }
                    case 2: {
                        viewCartDetail();
                        break;
                    }
                    case 3: {
                        viewCartDetail();
                        System.out.println("Please pay your items");
                        System.out.println("Total price: " + yourCart.getTotalPrice());
                    }
                    break;
                }
            } while (selection != 3);
            break;
        }


    }

    void viewMenuCart(){
        System.out.println("-----Shopping cart-----");
        System.out.println("1.Choose item you want to add to your cart");
        System.out.println("2.View your cart");
        System.out.println("3.Purchase");
        System.out.println("-----------------------");
    }


    void viewCartDetail() {
        cart = yourCart.getCart();
        System.out.println("-------Your cart-------");
        for (Item item : cart) {
            System.out.println("Item: " + item.getName() + ", Price: " + item.getPrice() + ", Quantity: " + item.getQuantity());
        }
    }

}
