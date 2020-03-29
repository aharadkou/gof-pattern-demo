package com.gsu.decorator.condiment;

import com.gsu.decorator.base.Beverage;
import com.gsu.decorator.base.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return 0.40 * this.getSize().getFactor() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }
}
