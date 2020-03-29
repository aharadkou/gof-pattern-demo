package com.gsu.decorator;

public enum CoffeeSize {
    SMALL, MEDIUM, BIG;

    public int getFactor() {
        return this.ordinal() + 1;
    }
}
