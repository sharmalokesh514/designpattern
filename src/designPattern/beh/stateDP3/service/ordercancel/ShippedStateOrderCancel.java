package designPattern.beh.stateDP3.service.ordercancel;

import designPattern.beh.stateDP3.entity.OrderEntity;

public class ShippedStateOrderCancel {

    public void cancel(OrderEntity orderEntity) {
        System.out.println("Send Notification,email and message to customer");
        System.out.println("Send Notification,email and message to Seller");
        System.out.println("Send Notification,email and message to Delivery Company");
        System.out.println("Proceed Refund");
    }

}
