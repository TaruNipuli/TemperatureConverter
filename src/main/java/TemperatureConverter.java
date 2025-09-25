import java.util.Scanner;

public class TemperatureConverter {

    public double fahrenheitToCelsius(int temperatureFahrenheit) {
        return (double) ((temperatureFahrenheit - 32) * 5) / 9;
    }

    public double celsiusToFahrenheit(int temperatureCelsius) {
        return (double) ((temperatureCelsius * 9) / 5) + 32;
    }

    public String isExtremeTemperature(int temperature) {
        if (temperature < -40 || temperature > 50) {
            return "This is extreme temperature";
        } else {
            return "This is not extreme temperature";
        }
    }

    public double kelvinToCelsius(int temperatureKelvin) {
        return (double) ((temperatureKelvin - 273.15));
    }

}
