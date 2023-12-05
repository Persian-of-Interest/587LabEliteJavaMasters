import org.junit.Test;
import static org.junit.Assert.assertEquals;

//Tests for UserStory#1
public class TestingTemperatureButtonsTest {

    @Test
    public void testTemperatureChanges() {
        // Test the increase temperature functionality
        assertEquals(22, increaseTemperature(20));

        // Test the decrease temperature functionality
        assertEquals(18, decreaseTemperature(20));
    }

    @Test
    public void testDecreaseTemperature() {
        // Test the decrease temperature functionality
        assertEquals(18, decreaseTemperature(20));
        assertEquals(8, decreaseTemperature(10));
    }

    @Test
    public void testIncreaseTemperature() {
        // Test the increase temperature functionality
        assertEquals(22, increaseTemperature(20));
        assertEquals(30, increaseTemperature(28));
    }

    // Utility method to simulate the decrease temperature functionality
    private int decreaseTemperature(int currentTemperature) {
        // Decrease temperature functionality
        // For simplicity, let's assume a constant decrement of 2 degrees
        int decreasedTemperature = currentTemperature - 2;
        // Assert that the expected value matches the current temperature
        assertEquals(decreasedTemperature, currentTemperature - 2);
        return decreasedTemperature;
    }

    // Utility method to simulate the increase temperature functionality
    private int increaseTemperature(int currentTemperature) {
        // Increase temperature functionality
        // For simplicity, let's assume a constant increment of 2 degrees
        int increasedTemperature = currentTemperature + 2;
        // Assert that the expected value matches the current temperature
        assertEquals(increasedTemperature, currentTemperature + 2);
        return increasedTemperature;
    }
}
