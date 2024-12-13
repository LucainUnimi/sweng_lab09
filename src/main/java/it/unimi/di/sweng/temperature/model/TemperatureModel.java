package it.unimi.di.sweng.temperature.model;

public class TemperatureModel implements Model {

    private double temperature;

    @Override
    public double getTemp() {
        return this.temperature;
    }

    @Override
    public void setTemp(double temp) {
        this.temperature = temp;
    }
}
