package com.gsu.factory.abstractFactory;

import com.gsu.factory.abstractFactory.factory.LilyFactory;
import com.gsu.factory.abstractFactory.factory.RoseCentralFactory;
import com.gsu.factory.abstractFactory.factory.RosePrudkovskiyFactory;

import java.util.ArrayList;
import java.util.List;

public final class Main {
    private static final List<FlowerConsumer> CONSUMERS;
    static {
        CONSUMERS = new ArrayList<>();
        CONSUMERS.add(new FlowerConsumer(new RoseCentralFactory()));
        CONSUMERS.add(new FlowerConsumer(new RosePrudkovskiyFactory()));
        CONSUMERS.add(new FlowerConsumer(new LilyFactory()));
    }

    public static void main(String[] args) {
        CONSUMERS.forEach(FlowerConsumer::orderFlower);
    }

}
