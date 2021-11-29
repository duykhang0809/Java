package designpattern.builder.builder;

import designpattern.builder.product.order.Order;
import designpattern.builder.product.type.BreadType;
import designpattern.builder.product.type.OrderType;
import designpattern.builder.product.type.SauceType;
import designpattern.builder.product.type.VegetableType;

public interface OrderBuilder {

    OrderBuilder orderType(OrderType orderType);

    OrderBuilder orderBread(BreadType breadType);

    OrderBuilder orderSauce(SauceType sauceType);

    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}
