package com.gsu.decorator.beverage;

import com.gsu.decorator.base.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89 * this.getSize().getFactor();
    }
}
