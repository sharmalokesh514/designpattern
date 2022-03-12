package designPattern.beh.stateDP4.service.ordercancel;

import designPattern.beh.stateDP4.entity.OrderEntity;

public class NewStateOrderCancel implements OrderCancel {

    public void cancel(OrderEntity orderEntity) {
        System.out.println("Send Notification to customer");
        System.out.println("Send Notification to Seller");
        System.out.println("Proceed Refund");
    }

}
