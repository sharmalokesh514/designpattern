package designPattern.beh.stateDP4.service.ordercancel;

import designPattern.beh.stateDP4.entity.OrderEntity;

public interface OrderCancel {
    void cancel(OrderEntity orderEntity);
}
