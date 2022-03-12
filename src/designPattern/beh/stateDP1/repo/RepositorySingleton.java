package designPattern.beh.stateDP1.repo;

import designPattern.beh.stateDP1.entity.OrderEntity;

import java.util.HashMap;
import java.util.Objects;

public class RepositorySingleton {

    private static RepositorySingleton instance;

    private HashMap<Integer, OrderEntity> orderEntityHashMap;

    private RepositorySingleton() {
        orderEntityHashMap = new HashMap<>();
    }

    public void saveOrder( OrderEntity orderEntity ) {
        orderEntityHashMap.put(orderEntity.getId(),orderEntity);
    }

    public OrderEntity getOrder( int id ) {
        // todo: throw if not present
        //todo: use prototypeDP
        return orderEntityHashMap.get(id);
    }

    public static RepositorySingleton getInstance() {
        if(Objects.isNull(instance) ) {
            synchronized ( RepositorySingleton.class ) {
                if( Objects.isNull(instance) ) {
                    instance =  new RepositorySingleton();
                }
            }
        }

        return instance;
    }

}
