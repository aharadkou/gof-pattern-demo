package com.gsu.decorator.base;

import com.gsu.decorator.CoffeeSize;

public abstract class Beverage {
    protected String description = "Unknown Beverage";
    private CoffeeSize size = CoffeeSize.MEDIUM;

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    public CoffeeSize getSize() {
        return size;
    }

    public void setSize(final CoffeeSize size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return getDescription() + " in " + this.getSize().name().toLowerCase() + " cup $" + cost();
    }
}
