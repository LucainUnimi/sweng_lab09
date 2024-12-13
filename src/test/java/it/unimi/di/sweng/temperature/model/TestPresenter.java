package it.unimi.di.sweng.temperature.model;

import it.unimi.di.sweng.temperature.presenter.Presenter;
import it.unimi.di.sweng.temperature.presenter.ScaleStrategy;
import it.unimi.di.sweng.temperature.presenter.TemperaturePresenter;
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
        Presenter SUT = new TemperaturePresenter(DOC);
        SUT.action("10.45");

        verify(DOC).convertToCelsius(10.45);

    }
}
