package designPattern.beh.stateDP.service;

public class Order {

    private OrderCancelStateHandler orderCancelStateHandler;

    public double cancelOrder(){
        return orderCancelStateHandler.handleCancellation();
    }

    public void newStateChange( ) {
        this.orderCancelStateHandler = new NewStateHandler();
    }

    public void paidStateChange( ) {
        this.orderCancelStateHandler = new PaidOrderStateHandler();
    }

}
