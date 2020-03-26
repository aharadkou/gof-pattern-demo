package com.gsu.observer;

public class ConsoleDisplayObserver implements Observer {
    @Override
    public void notify(final int revolutionNumber, final double gasAmount,
                       final double speed, final int transmission) {
        StringBuilder info = new StringBuilder();
        info.append("Кол-во оборотов: ").append(revolutionNumber).append(System.lineSeparator());
        info.append("Топливо: ").append(gasAmount).append(" л").append(System.lineSeparator());
        info.append("Скорость: ").append(speed).append(" км/ч").append(System.lineSeparator());
        info.append("Передача: ").append(transmission).append(System.lineSeparator());
        System.out.println(info);
    }
}
