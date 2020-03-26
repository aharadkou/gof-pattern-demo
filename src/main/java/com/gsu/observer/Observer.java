package com.gsu.observer;

public interface Observer {
    void notify(int revolutionNumber, double gasAmount, double speed, int transmission);
}
