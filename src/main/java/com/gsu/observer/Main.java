package com.gsu.observer;

public final class Main {
    public static void main(String[] args) {
        final Observable carObservable = new CarObservable();
        final Observer consoleObserver = new ConsoleDisplayObserver();
        carObservable.addObserver(consoleObserver);
        carObservable.next(125, 12.4, 54, 3);
        carObservable.next(156, 11.4, 95, 5);
    }
}
