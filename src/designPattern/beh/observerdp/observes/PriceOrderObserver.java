package designPattern.beh.observerdp.observes;

public class PriceOrderObserver implements OrderObserver {

    @Override
    public void update(OrderModel orderModel) {
        if( orderModel.getTotalPrice() >= 200 ) {
            orderModel.setDiscount(10);
        }
    }
}
