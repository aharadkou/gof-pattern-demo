package com.gsu.decorator.beverage;

import com.gsu.decorator.base.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05 * this.getSize().getFactor();
    }

}
