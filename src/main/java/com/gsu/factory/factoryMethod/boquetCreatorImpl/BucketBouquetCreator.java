package com.gsu.factory.factoryMethod.boquetCreatorImpl;

import com.gsu.factory.factoryMethod.AbstractBouquetCreator;
import com.gsu.factory.factoryMethod.Bouquet;
import com.gsu.factory.factoryMethod.boquetImpl.BucketBouquet;

public class BucketBouquetCreator extends AbstractBouquetCreator {
    @Override
    public Bouquet createBouquet() {
        return new BucketBouquet();
    }
}
