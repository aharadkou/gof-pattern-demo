package com.gsu.factory.factoryMethod.boquetImpl;

import com.gsu.factory.factoryMethod.Bouquet;

public class BucketBouquet implements Bouquet {
    @Override
    public void form() {
        System.out.println("Составление букета в корзинке");
    }

    @Override
    public void sign() {
        System.out.println("Подпись визитки букета в корзинке");
    }

    @Override
    public void pack() {
        System.out.println("Упаковка букета в корзинке");
    }
}
