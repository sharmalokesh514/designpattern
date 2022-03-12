package designPattern.beh.stateDP.service;

public class DeliveredOrderStateHandler implements OrderCancelStateHandler {

    @Override
    public double handleCancellation() {
        //todo : notify delivery service
        //todo : notify seller
        // notify customer
        // calculate charges and process refund
        return 20;
    }
}
