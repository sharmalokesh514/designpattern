package designPattern.beh.observerdp.observes;

import java.util.ArrayList;
import java.util.List;

public class OrderModel {

    private int id;

    private static int UNIQUE_ID;

    private int price;

    private int discount;

    private int shipingAmout;

    // todo: create item model and make it list
    private int countItem;

    private List<OrderObserver> orderObservers;

    public OrderModel() {
        setId();
        orderObservers = new ArrayList<>();
    }

    public void removeObservers(OrderObserver orderObserver) {
        orderObservers.remove(orderObserver);
    }

    public void addObservers(OrderObserver orderObserver) {
        orderObservers.add(orderObserver);
    }

    public int getId() {
        return id;
    }

    public void setId() {
        synchronized (OrderModel.class) {
            this.id = UNIQUE_ID;
            UNIQUE_ID = UNIQUE_ID + 1;
        }
    }

    public static int getUniqueId() {
        return UNIQUE_ID;
    }

    public static void setUniqueId(int uniqueId) {
        UNIQUE_ID = uniqueId;
    }

    public int getTotalPrice() {
        return price - discount;
    }

    //todo:
    // here we are just adding price of the item
    public void addItem(int itemPrice) {
        this.price = this.price + itemPrice;
        this.countItem = this.countItem + 1;
        orderObservers.forEach(o->o.update(this));
    }

    public void removeItem(int itemPrice) {
        this.price = this.price - itemPrice;
        this.countItem = this.countItem - 1;
        orderObservers.forEach(o->o.update(this));
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getCountItem() {
        return countItem;
    }

    public int getShipingAmout() {
        return shipingAmout;
    }

    public void setShipingAmout(int shipingAmout) {
        this.shipingAmout = shipingAmout;
    }
}
