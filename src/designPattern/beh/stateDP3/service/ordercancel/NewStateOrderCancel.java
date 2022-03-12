package designPattern.beh.stateDP3.service.ordercancel;

import designPattern.beh.stateDP3.entity.OrderEntity;

public class NewStateOrderCancel {

    public void cancel(OrderEntity orderEntity) {
        System.out.println("Send Notification to customer");
        System.out.println("Send Notification to Seller");
        System.out.println("Proceed Refund");
    }

}
