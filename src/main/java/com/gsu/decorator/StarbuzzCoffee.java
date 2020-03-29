package com.gsu.decorator;


import com.gsu.decorator.base.Beverage;
import com.gsu.decorator.beverage.Espresso;
import com.gsu.decorator.condiment.Milk;
import com.gsu.decorator.condiment.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage mediumEspresso = new Espresso();
        System.out.println(mediumEspresso);
        Beverage bigEspresso = new Espresso();
        bigEspresso.setSize(CoffeeSize.BIG);
        System.out.println(bigEspresso);
        Beverage mediumEspressoWithMilk = new Milk(mediumEspresso);
        System.out.println(mediumEspressoWithMilk);
        Beverage bigEspressoWithMocha = new Mocha(bigEspresso);
        System.out.println(bigEspressoWithMocha);
    }
}
