package designPattern.beh.stateDP4.service.ordercancel;

import designPattern.beh.stateDP4.entity.OrderEntity;

public class ShippedStateOrderCancel implements OrderCancel {

    public void cancel(OrderEntity orderEntity) {
        System.out.println("Send Notification,email and message to customer");
        System.out.println("Send Notification,email and message to Seller");
        System.out.println("Send Notification,email and message to Delivery Company");
        System.out.println("Proceed Refund");
    }

}
