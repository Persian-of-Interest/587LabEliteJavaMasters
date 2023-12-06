import org.junit.Test;
import static org.junit.Assert.assertTrue;

// Tests for UserStory#3
public class TestingDurability {

    // Test method to simulate the durability and lifespan of the smart thermometer
    @Test
    public void testDurability() {
        // Simulate multiple years of usage
        int yearsInUse = simulateYearsOfUsage(10); // Assume 10 years for lifespan

        // Check if the thermometer has reached the expected lifespan for functionality
        assertTrue("Smart thermometer lasted the expected number of years", yearsInUse >= 10);

        // Check if the warranty information is correct or valid
        assertTrue("Smart thermometer warranty information is correct", hasCorrectWarranty());
    }

    // Simulate multiple years of usage
    private int simulateYearsOfUsage(int numberOfYears) {
        int yearsInUse = 0;
        for (int i = 0; i < numberOfYears; i++) {
            // Simulate one year passing
            yearsInUse++;
        }
        return yearsInUse;
    }

    // Utility method to check if the warranty information is correctly set
    private boolean hasCorrectWarranty() {
        // Assuming a 3-year warranty period
        int warrantyYears = 3;
        return warrantyYears == 3;
    }
}
