import org.junit.Test;
import static org.junit.Assert.assertEquals;

// Tests for UserStory#5
public class TestingFanControls {

    // Method to test fan intensity controls
    @Test
    public void testFanControls() {
        // Change fan intensity levels
        int lowSpeed = changeFanSpeed("low");
        int mediumSpeed = changeFanSpeed("medium");
        int highSpeed = changeFanSpeed("high");

        // Check if the fan speeds match changes made by user (Arbitrary numbers)
        assertEquals("Low fan speed", 1, lowSpeed);
        assertEquals("Medium fan speed", 2, mediumSpeed);
        assertEquals("High fan speed", 3, highSpeed);
    }

    // Method to change fan speed and return the current speed
    private int changeFanSpeed(String speed) {
        // Change fan speed based on the 'speed'
        switch (speed) {
            case "low":
                return 1;
            case "medium":
                return 2;
            case "high":
                return 3;
            default:
                return 0; // Invalid speed
        }
    }
}
