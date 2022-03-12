package designPattern.beh.stateDP3.service;

import designPattern.beh.stateDP3.entity.OrderEntity;
import designPattern.beh.stateDP3.entity.OrderState;
import designPattern.beh.stateDP3.repo.RepositorySingleton;
import designPattern.beh.stateDP3.service.ordercancel.NewStateOrderCancel;
import designPattern.beh.stateDP3.service.ordercancel.ReadyStateOrderCancel;
import designPattern.beh.stateDP3.service.ordercancel.ShippedStateOrderCancel;

public class CancelOrderServiceImpl {

    private RepositorySingleton repositorySingleton;

    private OrderServiceImpl orderService;

    public CancelOrderServiceImpl() {
        repositorySingleton = RepositorySingleton.getInstance();
        orderService = new OrderServiceImpl();
    }

    public boolean cancelOrder( int id ) {

        OrderEntity orderEntity = repositorySingleton.getOrder(id);

        //todo : remove this code from this class to follow SRP
        if( orderEntity.getOrderState().equals(OrderState.NEW_STATE) ) {
            NewStateOrderCancel newStateOrderCancel = new NewStateOrderCancel();
            newStateOrderCancel.cancel(orderEntity);
        } else if( orderEntity.getOrderState().equals(OrderState.READY_STATE) ) {
            ReadyStateOrderCancel readyStateOrderCancel = new ReadyStateOrderCancel();
            readyStateOrderCancel.cancel(orderEntity);
        } else if (orderEntity.getOrderState().equals(OrderState.SHIPPED_STATE)  ) {
            ShippedStateOrderCancel shippedStateOrderCancel = new ShippedStateOrderCancel();
            shippedStateOrderCancel.cancel(orderEntity);
        }

        orderEntity.setOrderState(OrderState.CANCEL);
        repositorySingleton.saveOrder(orderEntity);

        return true;
    }


}
