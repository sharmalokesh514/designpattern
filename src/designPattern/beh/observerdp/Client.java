package designPattern.beh.observerdp;

import designPattern.beh.observerdp.observes.OrderModel;
import designPattern.beh.observerdp.observes.PriceOrderObserver;
import designPattern.beh.observerdp.observes.QuantityObserver;

public class Client {

    public static void main(String[] args) {
        OrderModel orderModel = new OrderModel();

        //todo : keep this in seprate class
        orderModel.addObservers(new PriceOrderObserver());
        orderModel.addObservers(new QuantityObserver());

        orderModel.addItem(150);
        System.out.println(orderModel.getTotalPrice());

        orderModel.addItem(150);
        System.out.println(orderModel.getTotalPrice());

    }

}
