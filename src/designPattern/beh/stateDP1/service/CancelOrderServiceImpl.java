package designPattern.beh.stateDP1.service;

import designPattern.beh.stateDP1.entity.OrderEntity;
import designPattern.beh.stateDP1.entity.OrderState;
import designPattern.beh.stateDP1.repo.RepositorySingleton;

public class CancelOrderServiceImpl {

    private RepositorySingleton repositorySingleton;

    private OrderServiceImpl orderService;

    public CancelOrderServiceImpl() {
        repositorySingleton = RepositorySingleton.getInstance();
        orderService = new OrderServiceImpl();
    }

    public boolean cancelOrder( int id ) {

        OrderEntity orderEntity = repositorySingleton.getOrder(id);

        if( orderEntity.getOrderState().equals(OrderState.NEW_STATE) ) {
            System.out.println("Send Notification to customer");
            System.out.println("Send Notification to Seller");
            System.out.println("Proceed Refund");
            orderEntity.setOrderState(OrderState.CANCEL);
            repositorySingleton.saveOrder(orderEntity);
        } else if( orderEntity.getOrderState().equals(OrderState.READY_STATE) ) {
            System.out.println("Send Notification,email and message to customer");
            System.out.println("Send Notification,email and message to Seller");
            System.out.println("Send Notification,email and message to Delivery Company for not to pickup");
            System.out.println("Proceed Refund");
            orderEntity.setOrderState(OrderState.CANCEL);
            repositorySingleton.saveOrder(orderEntity);
        } else if (orderEntity.getOrderState().equals(OrderState.SHIPPED_STATE)  ) {
            System.out.println("Send Notification,email and message to customer");
            System.out.println("Send Notification,email and message to Seller");
            System.out.println("Send Notification,email and message to Delivery Company");
            System.out.println("Proceed Refund");
            orderEntity.setOrderState(OrderState.CANCEL);
            repositorySingleton.saveOrder(orderEntity);
        }

        return true;
    }

}
