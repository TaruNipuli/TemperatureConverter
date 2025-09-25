import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(0.0, converter.fahrenheitToCelsius(32));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(122.0, converter.celsiusToFahrenheit(50));
    }

    @Test
    void fahrenheitToKelvin() {
        assertEquals(-253.14999999999998, converter.kelvinToCelsius(20));
    }

    @Test
    void isExtremeTemperature() {
        assertEquals("This is extreme temperature", converter.isExtremeTemperature(55));
        assertEquals("This is not extreme temperature", converter.isExtremeTemperature(20));
    }
}
