package it.unimi.di.sweng.temperature;

import it.unimi.di.sweng.temperature.model.Model;
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

    Model model;

    //TODO: modificare e completare il seguente codice per istanziare e collegare i vari componenti

    // scommentare dopo aver creato il model
    //model.notifyObservers();

    Scene scene = new Scene(gridPane);
    stage.setScene(scene);
    stage.show();
  }
}
