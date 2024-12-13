package it.unimi.di.sweng.temperature.model;

import it.unimi.di.sweng.temperature.Observable;
import it.unimi.di.sweng.temperature.Observer;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class TemperatureModel implements Model, Observable<Double> {

    private double temperature;
    private final List<Observer<Double>> observers = new ArrayList<>();

    @Override
    public double getTemp() {
        return this.temperature;
    }

    @Override
    public void setTemp(double temp) {
        this.temperature = temp;
    }

    @Override
    public void notifyObservers() {
        //observers.forEach(o -> o.update(this, this.temperature));
    }

    @Override
    public void addObserver(@NotNull Observer<Double> obs) {
        //observers.add(obs);
    }

    @Override
    public @NotNull Double getState() {
        return 0.0;
    }
}
