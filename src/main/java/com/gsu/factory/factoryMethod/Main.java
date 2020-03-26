package com.gsu.factory.factoryMethod;

import com.gsu.factory.factoryMethod.boquetCreatorImpl.BucketBouquetCreator;
import com.gsu.factory.factoryMethod.boquetCreatorImpl.FuneralBouquetCreator;
import com.gsu.factory.factoryMethod.boquetCreatorImpl.SimpleBouquetCreator;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private static final List<AbstractBouquetCreator> CREATORS;

    static  {
        CREATORS = new ArrayList<>();
        CREATORS.add(new SimpleBouquetCreator());
        CREATORS.add(new FuneralBouquetCreator());
        CREATORS.add(new BucketBouquetCreator());
    }

    public static void main(String[] args) {
        CREATORS.forEach(AbstractBouquetCreator::orderBouquet);
    }
}
