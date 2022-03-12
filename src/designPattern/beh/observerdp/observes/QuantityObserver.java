package designPattern.beh.observerdp.observes;

public class QuantityObserver implements OrderObserver {

    @Override
    public void update(OrderModel orderModel) {
        if( orderModel.getCountItem() <5 ) {
            orderModel.setShipingAmout(10);
        } else {
            orderModel.setShipingAmout(10);
        }
    }
}
