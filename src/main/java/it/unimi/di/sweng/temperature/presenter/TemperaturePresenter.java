package it.unimi.di.sweng.temperature.presenter;

import it.unimi.di.sweng.temperature.Observable;
import it.unimi.di.sweng.temperature.Observer;
import it.unimi.di.sweng.temperature.model.Model;
import it.unimi.di.sweng.temperature.model.TemperatureModel;
import it.unimi.di.sweng.temperature.view.View;
import org.jetbrains.annotations.NotNull;

public class TemperaturePresenter implements Presenter, Observer<Double> {

    @NotNull private ScaleStrategy strategy = CelsiusStrategy.getInstance();
    @NotNull private final View view;
    @NotNull private final Model model;

    public TemperaturePresenter(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void setStategy(@NotNull ScaleStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void action(@NotNull String text) {
        model.setTemp(strategy.convertToCelsius(Double.parseDouble(text)));
    }

    @Override
    public void update(@NotNull Observable<Double> subject, @NotNull Double state) {
        Double value = strategy.convertFromCelsius(state);
        view.setValue(String.format("%.2f", value));
    }
}
