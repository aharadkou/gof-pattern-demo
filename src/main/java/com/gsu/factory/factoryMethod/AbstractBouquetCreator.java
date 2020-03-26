package com.gsu.factory.factoryMethod;

public abstract class AbstractBouquetCreator {

    public void orderBouquet() {
        final Bouquet bouquet = createBouquet();
        System.out.println("^^^^^^^^^^^^^^^^");
        bouquet.form();
        bouquet.sign();
        bouquet.pack();
        System.out.println("----------------");
    }

    public abstract Bouquet createBouquet();
}
