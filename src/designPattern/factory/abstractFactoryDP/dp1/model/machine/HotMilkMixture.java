package designPattern.factory.abstractFactoryDP.dp1.model.machine;

public class HotMilkMixture implements Mixture {

    private double milk;
    private double water;

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public void prepareMixture() {
        
    }
}
