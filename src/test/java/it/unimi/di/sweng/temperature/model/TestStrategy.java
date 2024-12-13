package it.unimi.di.sweng.temperature.model;

import it.unimi.di.sweng.temperature.presenter.CelsiusStrategy;
import it.unimi.di.sweng.temperature.presenter.ScaleStrategy;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.within;

@Timeout(2)
public class TestStrategy {
    @Test
    void testCelsiusStrategy() {
        ScaleStrategy strategy = CelsiusStrategy.getInstance();

        assertThat(strategy.convertFromCelsius(42)).isCloseTo(42, within(0.0001));
        assertThat(strategy.convertToCelsius(42)).isCloseTo(42, within(0.0001));
    }
}
