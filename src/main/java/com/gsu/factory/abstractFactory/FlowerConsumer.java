package com.gsu.factory.abstractFactory;

import com.gsu.factory.abstractFactory.factory.FlowerFactory;

public class FlowerConsumer {

    private final FlowerFactory flowerFactory;

    public FlowerConsumer(final FlowerFactory flowerFactory) {
        this.flowerFactory = flowerFactory;
    }

    public void orderFlower() {
        StringBuilder order = new StringBuilder();
        order.append("----Ordered flower----").append(System.lineSeparator());
        order.append("Flower: ").append(flowerFactory.createFlower().getClass().getSimpleName());
        order.append(System.lineSeparator());
        order.append("Grass: ").append(flowerFactory.createGrass().getClass().getSimpleName());
        order.append(System.lineSeparator());
        order.append("Market: ").append(flowerFactory.createMarket().getClass().getSimpleName());
        order.append(System.lineSeparator());
        order.append("Sparkles: ").append(flowerFactory.createSparkles().getClass().getSimpleName());
        order.append(System.lineSeparator());
        order.append("Tape: ").append(flowerFactory.createTape().getClass().getSimpleName());
        order.append(System.lineSeparator());
        order.append("----------------------");
        System.out.println(order);
    }

}
