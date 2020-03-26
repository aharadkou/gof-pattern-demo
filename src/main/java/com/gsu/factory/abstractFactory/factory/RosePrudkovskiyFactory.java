package com.gsu.factory.abstractFactory.factory;

import com.gsu.factory.abstractFactory.flower.Flower;
import com.gsu.factory.abstractFactory.flower.RoseFlower;
import com.gsu.factory.abstractFactory.grass.FernGrass;
import com.gsu.factory.abstractFactory.grass.Grass;
import com.gsu.factory.abstractFactory.market.Market;
import com.gsu.factory.abstractFactory.market.PrudkovskiyMarket;
import com.gsu.factory.abstractFactory.sparkles.Sparkles;
import com.gsu.factory.abstractFactory.sparkles.WithSparkles;
import com.gsu.factory.abstractFactory.tape.SilkTape;
import com.gsu.factory.abstractFactory.tape.Tape;

public class RosePrudkovskiyFactory implements FlowerFactory {
    @Override
    public Flower createFlower() {
        return new RoseFlower();
    }

    @Override
    public Grass createGrass() {
        return new FernGrass();
    }

    @Override
    public Market createMarket() {
        return new PrudkovskiyMarket();
    }

    @Override
    public Sparkles createSparkles() {
        return new WithSparkles();
    }

    @Override
    public Tape createTape() {
        return new SilkTape();
    }
}
