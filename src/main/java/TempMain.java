public class TempMain {
    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        int celsius = 25;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        System.out.println(celsius + "°C = " + fahrenheit + "°F");

        int fahrenheitInput = 77;
        double celsiusResult = converter.fahrenheitToCelsius(fahrenheitInput);
        System.out.println(fahrenheitInput + "°F = " + celsiusResult + "°C");

        int kelvin = 300;
        double celsiusFromKelvin = converter.kelvinToCelsius(kelvin);
        System.out.println(kelvin + "K = " + celsiusFromKelvin + "°C");

        int temp = 100;
        System.out.println("Is " + temp + "° an extreme temperature? " + converter.isExtremeTemperature(temp));
    }
}
