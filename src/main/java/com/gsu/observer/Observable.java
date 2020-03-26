package com.gsu.observer;

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void next(int revolutionNumber, double gasAmount, double speed, int transmission);
}