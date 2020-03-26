package com.gsu.observer;

import java.util.ArrayList;
import java.util.List;

public class CarObservable implements Observable {

    private int revolutionNumber;
    private double gasAmount;
    private double speed;
    private int transmission;

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(final Observer observer) {
        observers.add(observer);
        observer.notify(revolutionNumber, gasAmount, speed, transmission);
    }

    @Override
    public void removeObserver(final Observer observer) {
        observers.remove(observer);
    }

    public void next(final int revolutionNumber, final double gasAmount,
                                final double speed, final int transmission) {
        this.revolutionNumber = revolutionNumber;
        this.gasAmount = gasAmount;
        this.speed = speed;
        this.transmission = transmission;
        observers.forEach(observer -> observer.notify(revolutionNumber, gasAmount, speed, transmission));
    }
}
