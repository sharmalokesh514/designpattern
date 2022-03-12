package designPattern.beh.stateDP.service;

public class PaidOrderStateHandler implements OrderCancelStateHandler {

    @Override
    public double handleCancellation() {
        System.out.println("Order cancelled and notifying seller, delivery service and process payment");
        //todo : 1. notify seller
        // notify delivery service
        // notify customer
        // calculate charges
        // process refund
        return 10;
    }
}
