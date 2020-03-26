package com.gsu.factory.factoryMethod.boquetImpl;

import com.gsu.factory.factoryMethod.Bouquet;

public class SimpleBouquet implements Bouquet {
    @Override
    public void form() {
        System.out.println("Составление простого букета");
    }

    @Override
    public void sign() {
        System.out.println("Подпись визитки простого букета");
    }

    @Override
    public void pack() {
        System.out.println("Упаковка простого букета");
    }
}
