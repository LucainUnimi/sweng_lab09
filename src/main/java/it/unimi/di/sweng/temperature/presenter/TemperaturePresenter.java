package it.unimi.di.sweng.temperature.presenter;

import it.unimi.di.sweng.temperature.Observable;
import org.jetbrains.annotations.NotNull;

public class TemperaturePresenter implements Presenter {
    private final ScaleStrategy strategy;

    public TemperaturePresenter(ScaleStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void action(@NotNull String text) {
        //strategy.convertToCelsius(Double.parseDouble(text));
    }
}
