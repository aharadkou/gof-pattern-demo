package com.gsu.decorator.base;

import com.gsu.decorator.CoffeeSize;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;

    public abstract String getDescription();

    @Override
    public CoffeeSize getSize() {
        return beverage.getSize();
    }
}
