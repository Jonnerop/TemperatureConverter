package Temperature;

public class TemperatureConverter {

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public boolean isExtremeTemperature(double temperature) {
        return temperature < -40 || temperature > 50;
    }

    public static double kelvinToFah(double kel) {
        return (kel - 273.15) * (9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        double celsius = 25.0;
        double fahrenheit = converter.celsiusToFahrenheit(celsius);
        double kelvin = 300.0;

        System.out.println(celsius + "°C to Fahrenheit: " + fahrenheit + "°F");
        System.out.println(kelvin + "K to Fahrenheit: " + kelvinToFah(kelvin) + "°F");
        System.out.println("Is " + fahrenheit + "°F an extreme temperature? " + converter.isExtremeTemperature(fahrenheit));
    }
}
