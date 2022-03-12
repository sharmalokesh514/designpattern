package designPattern.factory.abstractFactoryDP.dp1.model.machine;

import designPattern.constants.Constant;

public class ColdCoffeeMixture implements Mixture {

    private double coffee;
    private double water;
    private double milk;
    private double sugar;
    private double ice;

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public void setWater(double water) {
        this.water = water;
    }

    public void setMilk(double milk) {
        this.milk = milk;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setIce(double ice) {
        this.ice = ice;
    }

    @Override
    public void prepareMixture() {
        System.out.println(Constant.BLUE + "ColdCoffee is prepared");
    }
}
