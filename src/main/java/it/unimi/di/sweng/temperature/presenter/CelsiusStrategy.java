package it.unimi.di.sweng.temperature.presenter;

public class CelsiusStrategy implements ScaleStrategy {

    private static final CelsiusStrategy instance = new CelsiusStrategy();

    public static CelsiusStrategy getInstance() {
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
