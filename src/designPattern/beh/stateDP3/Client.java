package designPattern.beh.stateDP3;

import designPattern.beh.stateDP3.entity.OrderEntity;
import designPattern.beh.stateDP3.entity.OrderState;
import designPattern.beh.stateDP3.service.CancelOrderServiceImpl;
import designPattern.beh.stateDP3.service.OrderServiceImpl;

public class Client {

    public static void main(String[] args) {

        OrderServiceImpl orderService = new OrderServiceImpl();
        CancelOrderServiceImpl cancelOrderService = new CancelOrderServiceImpl();

        OrderEntity orderEntity1 = new OrderEntity();
        orderEntity1.setOrderState(OrderState.NEW_STATE);
        orderService.addOrder(orderEntity1);

        OrderEntity orderEntity2 = new OrderEntity();
        orderEntity2.setOrderState(OrderState.READY_STATE);
        orderService.addOrder(orderEntity2);

        OrderEntity orderEntity3 = new OrderEntity();
        orderEntity3.setOrderState(OrderState.SHIPPED_STATE);
        orderService.addOrder(orderEntity3);

        cancelOrderService.cancelOrder(1);
        cancelOrderService.cancelOrder(2);
        cancelOrderService.cancelOrder(3);


    }

}
