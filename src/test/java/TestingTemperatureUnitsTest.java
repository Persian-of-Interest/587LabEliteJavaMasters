import org.junit.Test;

import static org.junit.Assert.assertEquals;

//Tests for UserStory#1
public class TestingTemperatureUnitsTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testTempUnits() {
        double tempK = 373.15;
        // Test changing the units display as degrees F
        assertEquals("212.00 °F", showTempInDegreesF(tempK));

        // Test changing the units display as degrees C
        assertEquals("100.00 °C", showTempInDegreesC(tempK));
    }


    // Utility method to simulate the unit conversion to F
    private String showTempInDegreesF(double currentTemperature) {
        // assume temperature is stored as kelvin
        double tempF = ((currentTemperature - 273.15) * (9.0/5.0)) + 32;
        // Assert that the expected value matches the computed
        assertEquals(tempF, 212, DELTA);
        return String.format("%1.2f", tempF) + " °F";
    }

    // Utility method to simulate the unit conversion to C
    private String showTempInDegreesC(double currentTemperature) {
        // Increase temperature functionality
        double tempC = (currentTemperature - 273.15);
        // Assert that the expected value matches the current temperature
        assertEquals(tempC, 100, DELTA);
        return String.format("%1.2f", tempC) + " °C";
    }
}
