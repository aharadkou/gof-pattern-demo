package com.gsu.decorator.condiment;

import com.gsu.decorator.base.Beverage;
import com.gsu.decorator.base.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return 0.35 * beverage.getSize().getFactor() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

}
