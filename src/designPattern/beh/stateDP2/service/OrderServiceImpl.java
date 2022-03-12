package designPattern.beh.stateDP2.service;

import designPattern.beh.stateDP2.entity.OrderEntity;
import designPattern.beh.stateDP2.repo.RepositorySingleton;

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
