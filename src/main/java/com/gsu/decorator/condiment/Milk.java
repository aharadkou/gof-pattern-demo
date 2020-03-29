package com.gsu.decorator.condiment;

import com.gsu.decorator.base.Beverage;
import com.gsu.decorator.base.CondimentDecorator;

public class Milk extends CondimentDecorator {
    
    public Milk(Beverage beverage){
        this.beverage = beverage;
    }
    
    @Override
    public double cost() {
        return 0.25 * this.getSize().getFactor() + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

}
