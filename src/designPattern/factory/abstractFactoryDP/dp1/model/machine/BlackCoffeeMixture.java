package designPattern.factory.abstractFactoryDP.dp1.model.machine;

import designPattern.constants.Constant;

public class BlackCoffeeMixture implements Mixture{

    private double coffee;
    private double water;

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public void prepareMixture() {
        System.out.println(Constant.BLUE + "Prepared BlackCoffee");
    }
}
