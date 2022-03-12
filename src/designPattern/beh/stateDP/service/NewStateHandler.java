package designPattern.beh.stateDP.service;

public class NewStateHandler implements OrderCancelStateHandler {

    @Override
    public double handleCancellation() {
        System.out.println("Order cancelled, no need to inform anybody");
        return 0;
    }
}
