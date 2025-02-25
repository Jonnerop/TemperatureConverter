package Temperature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// Jonne Roponen
class TemperatureConverterTest {
    TemperatureConverter converter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        Assertions.assertEquals(0, converter.fahrenheitToCelsius(32), 0.01);
        Assertions.assertEquals(-15, converter.fahrenheitToCelsius(5), 0.01);
        Assertions.assertEquals(10, converter.fahrenheitToCelsius(50), 0.01);
    }

    @Test
    void celsiusToFahrenheit() {
        Assertions.assertEquals(32, converter.celsiusToFahrenheit(0), 0.01);
        Assertions.assertEquals(50, converter.celsiusToFahrenheit(10), 0.01);
        Assertions.assertEquals(5, converter.celsiusToFahrenheit(-15), 0.01);
    }

    @Test
    void isExtremeTemperature() {
        Assertions.assertTrue(converter.isExtremeTemperature(-41));
        Assertions.assertTrue(converter.isExtremeTemperature(51));
        Assertions.assertFalse(converter.isExtremeTemperature(-40));
        Assertions.assertFalse(converter.isExtremeTemperature(50));
    }

    @Test
    void kelvinToFah() {
        Assertions.assertEquals(32, TemperatureConverter.kelvinToFah(273.15), 0.01);
        Assertions.assertEquals(-459.67, TemperatureConverter.kelvinToFah(0), 0.01);
        Assertions.assertEquals(212, TemperatureConverter.kelvinToFah(373.15), 0.01);
    }
}
