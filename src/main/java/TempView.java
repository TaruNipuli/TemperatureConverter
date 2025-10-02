
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TempView extends Application {
    @Override
    public void start(Stage primaryStage) {
        TemperatureConverter converter = new TemperatureConverter();

        // Fahrenheit to Celsius
        TextField fahrenheitField = new TextField();
        fahrenheitField.setPromptText("Fahrenheit");
        Button fToCButton = new Button("Fahrenheit to Celsius");
        Label fToCResult = new Label();
        fToCButton.setOnAction(e -> {
            try {
                int f = Integer.parseInt(fahrenheitField.getText());
                double c = converter.fahrenheitToCelsius(f);
                fToCResult.setText("Celsius: " + c);
            } catch (NumberFormatException ex) {
                fToCResult.setText("Invalid input!");
            }
        });

        // Celsius to Fahrenheit
        TextField celsiusField = new TextField();
        celsiusField.setPromptText("Celsius");
        Button cToFButton = new Button("Celsius to Fahrenheit");
        Label cToFResult = new Label();
        cToFButton.setOnAction(e -> {
            try {
                int c = Integer.parseInt(celsiusField.getText());
                double f = converter.celsiusToFahrenheit(c);
                cToFResult.setText("Fahrenheit: " + f);
            } catch (NumberFormatException ex) {
                cToFResult.setText("Invalid input!");
            }
        });

        // Kelvin to Celsius
        TextField kelvinField = new TextField();
        kelvinField.setPromptText("Kelvin");
        Button kToCButton = new Button("Kelvin to Celsius");
        Label kToCResult = new Label();
        kToCButton.setOnAction(e -> {
            try {
                int k = Integer.parseInt(kelvinField.getText());
                double c = converter.kelvinToCelsius(k);
                kToCResult.setText("Celsius: " + c);
            } catch (NumberFormatException ex) {
                kToCResult.setText("Invalid input!");
            }
        });

        // Extreme temperature check
        TextField extremeField = new TextField();
        extremeField.setPromptText("Temperature");
        Button extremeButton = new Button("Check Temperature");
        Label extremeResult = new Label();
        extremeButton.setOnAction(e -> {
            try {
                int t = Integer.parseInt(extremeField.getText());
                String result = converter.isExtremeTemperature(t);
                extremeResult.setText(result);
            } catch (NumberFormatException ex) {
                extremeResult.setText("Invalid input!");
            }
        });


        VBox root = new VBox(10,
                new Label("Fahrenheit to Celsius:"), fahrenheitField, fToCButton, fToCResult,
                new Label("Celsius to Fahrenheit:"), celsiusField, cToFButton, cToFResult,
                new Label("Kelvin to Celsius:"), kelvinField, kToCButton, kToCResult,
                new Label("Extreme Temperature Check:"), extremeField, extremeButton, extremeResult
        );
        root.setPadding(new Insets(20));
        primaryStage.setScene(new Scene(root, 350, 500));
        primaryStage.setTitle("Temperature Converter");
        primaryStage.show();
    }
}
