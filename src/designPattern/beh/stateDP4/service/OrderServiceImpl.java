package designPattern.beh.stateDP4.service;

import designPattern.beh.stateDP4.entity.OrderEntity;
import designPattern.beh.stateDP4.repo.RepositorySingleton;

// todo: implement interface
public class OrderServiceImpl {

    private RepositorySingleton repositorySingleton;

    public OrderServiceImpl() {
        repositorySingleton = RepositorySingleton.getInstance();
    }

    public void addOrder(OrderEntity orderEntity ) {
        repositorySingleton.saveOrder(orderEntity);
    }

    public OrderEntity getOrder(int id ) {
        return repositorySingleton.getInstance().getOrder(id);
    }

}
