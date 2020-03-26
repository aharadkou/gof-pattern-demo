package com.gsu.factory.abstractFactory.factory;

import com.gsu.factory.abstractFactory.flower.Flower;
import com.gsu.factory.abstractFactory.grass.Grass;
import com.gsu.factory.abstractFactory.market.Market;
import com.gsu.factory.abstractFactory.sparkles.Sparkles;
import com.gsu.factory.abstractFactory.tape.Tape;

public interface FlowerFactory {
    Flower createFlower();
    Grass createGrass();
    Market createMarket();
    Sparkles createSparkles();
    Tape createTape();
}
