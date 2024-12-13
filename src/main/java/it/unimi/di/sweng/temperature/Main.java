package it.unimi.di.sweng.temperature;

import it.unimi.di.sweng.temperature.model.Model;
import it.unimi.di.sweng.temperature.model.TemperatureModel;
import it.unimi.di.sweng.temperature.presenter.FahrenheitStrategy;
import it.unimi.di.sweng.temperature.presenter.Presenter;
import it.unimi.di.sweng.temperature.presenter.TemperaturePresenter;
import it.unimi.di.sweng.temperature.view.MyTextView;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    stage.setTitle("Temperature 2024");

    MyTextView celsiusField = new MyTextView("Celsius");
    MyTextView celsiusField2 = new MyTextView("Celsius2");
    MyTextView fahrenheitField = new MyTextView("Fahrenheit");

    GridPane gridPane = new GridPane();
    gridPane.setBackground(new Background(new BackgroundFill(Color.DARKGRAY, CornerRadii.EMPTY, Insets.EMPTY)));
    gridPane.setPadding(new Insets(10, 10, 10, 10));

    gridPane.add(celsiusField, 1, 0);
    gridPane.add(fahrenheitField, 1, 1);
    gridPane.add(celsiusField2, 1, 2);

    TemperatureModel model;

    model = new TemperatureModel();

    TemperaturePresenter presenter = new TemperaturePresenter(celsiusField, model);
    celsiusField.addHandlers(presenter);
    model.addObserver(presenter);
    presenter = new TemperaturePresenter(fahrenheitField, model);
    presenter.setStategy(FahrenheitStrategy.getInstance());
    model.addObserver(presenter);
    fahrenheitField.addHandlers(presenter);
    presenter = new TemperaturePresenter(celsiusField2, model);
    celsiusField2.addHandlers(presenter);
    model.addObserver(presenter);



    Scene scene = new Scene(gridPane);
    stage.setScene(scene);
    stage.show();
  }
}
