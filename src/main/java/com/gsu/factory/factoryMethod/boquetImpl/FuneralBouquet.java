package com.gsu.factory.factoryMethod.boquetImpl;

import com.gsu.factory.factoryMethod.Bouquet;

public class FuneralBouquet implements Bouquet {
    @Override
    public void form() {
        System.out.println("Составление венка");
    }

    @Override
    public void sign() {
        System.out.println("Подпись визитки венка");
    }

    @Override
    public void pack() {
        System.out.println("Упаковка венка");
    }
}
