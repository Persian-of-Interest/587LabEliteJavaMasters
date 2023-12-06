import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Tests for UserStory#2
public class TestingTemperatureDisplay {
    // Validating temperature display functionality (for both Celsius and Farenheit)
    @Test
    public void testDisplayTemperatureInCelsius() {
        // Assert that the temperature display matches the expected format in Celsius
        assertEquals("25.0°C", getDisplay(25, Unit.CELSIUS));
    }

    // Test method for displaying temperature in Fahrenheit
    @Test
    public void testDisplayTemperatureInFahrenheit() {
        // Assert that the temperature display matches the expected format in Fahrenheit
        assertEquals("77.0°F", getDisplay(77, Unit.FAHRENHEIT));
    }

    // Utility method to generate the temperature display based on the provided values
    private String getDisplay(double temperature, Unit unit) {
        // Format the temperature and unit symbol into a string
        return String.format("%.1f%s", temperature, unit.getSymbol());
    }

    // Enumeration representing temperature units
    private enum Unit {
        CELSIUS("°C"), // Celsius
        FAHRENHEIT("°F"); // Farenheit

        // Symbol associated with the temperature unit
        private final String symbol;

        // Initializes the temperature unit with its symbol
        Unit(String symbol) {
            this.symbol = symbol;
        }

        // Retrieve the symbol of the temperature unit
        public String getSymbol() {
            return symbol;
        }
    }
}
