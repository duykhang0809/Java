package collections;

import java.util.List;

public class ShoppingCart implements ShoppingService {
    private List<Item> itemList;
    private long totalPrice;
    private List<Item> cart;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public long getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(long totalPrice) {
        this.totalPrice = totalPrice;
    }

    public List<Item> getCart() {
        return cart;
    }

    public void setCart(List<Item> cart) {
        this.cart = cart;
    }

    @Override
    public void addToCart(Item item) {
        cart.add(item);
        totalPrice += item.getPrice() * item.getQuantity();
    }

}
