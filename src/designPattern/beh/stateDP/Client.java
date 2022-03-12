package designPattern.beh.stateDP;

import designPattern.beh.stateDP.service.Order;

public class Client {

    public static void main(String[] args) {
        Order order = new Order();
        order.newStateChange();
        System.out.println(order.cancelOrder());

        order.paidStateChange();
        System.out.println(order.cancelOrder());
    }

}
