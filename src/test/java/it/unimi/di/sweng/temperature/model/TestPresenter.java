package it.unimi.di.sweng.temperature.model;

import it.unimi.di.sweng.temperature.Observable;
import it.unimi.di.sweng.temperature.Observer;
import it.unimi.di.sweng.temperature.presenter.CelsiusStrategy;
import it.unimi.di.sweng.temperature.presenter.Presenter;
import it.unimi.di.sweng.temperature.presenter.ScaleStrategy;
import it.unimi.di.sweng.temperature.presenter.TemperaturePresenter;
import it.unimi.di.sweng.temperature.view.View;
import javafx.scene.transform.Scale;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

@Timeout(2)
public class TestPresenter {

    @Test
    void testStrategy() {
        ScaleStrategy DOC = mock();
        TemperaturePresenter SUT = new TemperaturePresenter(mock(), mock());
        SUT.setStategy(DOC);
        SUT.action("10.45");

        verify(DOC).convertToCelsius(10.45);
    }

    @Test
    void testUpdate() {
        TemperatureModel mockedModel = mock();
        View mockedView = mock();
        TemperaturePresenter SUT = new TemperaturePresenter(mockedView, mockedModel);
        Double stato = 42.42;

        SUT.update(mockedModel, stato);
        verify(mockedView).setValue(stato.toString());
    }

}
