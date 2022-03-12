package designPattern.beh.stateDP2.service;

import designPattern.beh.stateDP2.entity.OrderEntity;
import designPattern.beh.stateDP2.entity.OrderState;
import designPattern.beh.stateDP2.repo.RepositorySingleton;

public class CancelOrderServiceImpl {

    private RepositorySingleton repositorySingleton;

    private OrderServiceImpl orderService;

    public CancelOrderServiceImpl() {
        repositorySingleton = RepositorySingleton.getInstance();
        orderService = new OrderServiceImpl();
    }

    // Method is following now SRP rule but class is not following the rule
    public boolean cancelOrder( int id ) {

        OrderEntity orderEntity = repositorySingleton.getOrder(id);

        if( orderEntity.getOrderState().equals(OrderState.NEW_STATE) ) {
            cancelNewOrders(orderEntity);
        } else if( orderEntity.getOrderState().equals(OrderState.READY_STATE) ) {
            cancelReadyState(orderEntity);
        } else if (orderEntity.getOrderState().equals(OrderState.SHIPPED_STATE)  ) {
            cancelShippedOrder(orderEntity);
        }

        orderEntity.setOrderState(OrderState.CANCEL);
        repositorySingleton.saveOrder(orderEntity);

        return true;
    }

    private void cancelNewOrders( OrderEntity orderEntity ) {

    }

    private void cancelReadyState( OrderEntity orderEntity) {
        System.out.println("Send Notification,email and message to customer");
        System.out.println("Send Notification,email and message to Seller");
        System.out.println("Send Notification,email and message to Delivery Company for not to pickup");
        System.out.println("Proceed Refund");
    }

    private void cancelShippedOrder( OrderEntity orderEntity ) {
        System.out.println("Send Notification,email and message to customer");
        System.out.println("Send Notification,email and message to Seller");
        System.out.println("Send Notification,email and message to Delivery Company");
        System.out.println("Proceed Refund");
    }


}
