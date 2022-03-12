package designPattern.beh.stateDP4.service;

import designPattern.beh.stateDP4.entity.OrderEntity;
import designPattern.beh.stateDP4.entity.OrderState;
import designPattern.beh.stateDP4.repo.RepositorySingleton;
import designPattern.beh.stateDP4.service.ordercancel.NewStateOrderCancel;
import designPattern.beh.stateDP4.service.ordercancel.OrderCancel;
import designPattern.beh.stateDP4.service.ordercancel.ReadyStateOrderCancel;
import designPattern.beh.stateDP4.service.ordercancel.ShippedStateOrderCancel;

public class CancelOrderServiceImpl {

    private RepositorySingleton repositorySingleton;

    private OrderServiceImpl orderService;

    public CancelOrderServiceImpl() {
        repositorySingleton = RepositorySingleton.getInstance();
        orderService = new OrderServiceImpl();
    }

    public boolean cancelOrder( int id ) {

        OrderEntity orderEntity = repositorySingleton.getOrder(id);
        cancelOrder(orderEntity);
        orderEntity.setOrderState(OrderState.CANCEL);
        repositorySingleton.saveOrder(orderEntity);

        return true;
    }

    //todo : remove this code from this class to follow SRP (Create new factory)
    public void cancelOrder(OrderEntity orderEntity) {
        if( orderEntity.getOrderState().equals(OrderState.NEW_STATE) ) {
            OrderCancel newStateOrderCancel = new NewStateOrderCancel();
            newStateOrderCancel.cancel(orderEntity);
        } else if( orderEntity.getOrderState().equals(OrderState.READY_STATE) ) {
            OrderCancel readyStateOrderCancel = new ReadyStateOrderCancel();
            readyStateOrderCancel.cancel(orderEntity);
        } else if (orderEntity.getOrderState().equals(OrderState.SHIPPED_STATE)  ) {
            OrderCancel shippedStateOrderCancel = new ShippedStateOrderCancel();
            shippedStateOrderCancel.cancel(orderEntity);
        }
    }


}
