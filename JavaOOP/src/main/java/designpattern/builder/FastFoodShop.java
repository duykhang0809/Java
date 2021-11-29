package designpattern.builder;


import designpattern.builder.concretebuilder.FastFoodOrderBuilder;
import designpattern.builder.product.order.Order;
import designpattern.builder.product.type.BreadType;
import designpattern.builder.product.type.OrderType;
import designpattern.builder.product.type.SauceType;
import designpattern.builder.product.type.VegetableType;

public class FastFoodShop {
    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE)
                .orderBread(BreadType.BEEF)
                .orderSauce(SauceType.SOY_SAUCE)
                .orderVegetable(VegetableType.SALAD)
                .build();
        System.out.println("Your order: " + order);
    }
}
