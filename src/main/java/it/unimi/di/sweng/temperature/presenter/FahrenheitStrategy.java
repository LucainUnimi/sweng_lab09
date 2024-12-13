package it.unimi.di.sweng.temperature.presenter;

public class FahrenheitStrategy implements ScaleStrategy {

    private static final FahrenheitStrategy instance = new FahrenheitStrategy();

    public static FahrenheitStrategy getInstance() {
        return instance;
    }

    @Override
    public double convertFromCelsius(double temperature) {
        return 0;
    }

    @Override
    public double convertToCelsius(double temperature) {
        return 0;
    }
}
