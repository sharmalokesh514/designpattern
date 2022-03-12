package designPattern.beh.stateDP4.entity;

public class OrderEntity {

    private int id;
    private static int ID = 1;
    private OrderState orderState;

    public OrderEntity () {
        setId();
    }

    public int getId() {
        return id;
    }

    private synchronized void setId() {
        this.id = ID;
        ID = ID+1;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }
}
