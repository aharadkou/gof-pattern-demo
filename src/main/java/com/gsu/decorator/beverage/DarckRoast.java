package com.gsu.decorator.beverage;

import com.gsu.decorator.base.Beverage;

public class DarckRoast extends Beverage {

    public DarckRoast() {
        description = "Darck Roast";
    }

    @Override
    public double cost() {
        return 0.99 * this.getSize().getFactor();
    }
}
