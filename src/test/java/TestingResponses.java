import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestingResponses {

    @Test
    public void testInvalidResponseErrorMessage() {
        String invalidResponse = getInvalidResponse();

        if (isInvalidResponse(invalidResponse)) {
            String errorMessage = generateErrorMessage(invalidResponse);
            assertEquals("Invalid response error message", "Error: Invalid response - " + invalidResponse, errorMessage);
        }
    }

    @Test
    public void testGenerateHelpMessage() {
        String helpMessage = generateHelpMessage();
        assertTrue("Help message contains 'help'", helpMessage.toLowerCase().contains("help"));
    }

    @Test
    public void testHelpMessageContent() {
        String helpMessage = generateHelpMessage();
        assertEquals("Help message content", "This is a help message.", helpMessage);
    }

    private String getInvalidResponse() {
        return "InvalidValue123";
    }

    private boolean isInvalidResponse(String response) {
        return response.contains("Invalid");
    }

    private String generateErrorMessage(String invalidResponse) {
        return "Error: Invalid response - " + invalidResponse;
    }

    private String generateHelpMessage() {
        return "This is a help message.";
    }
}
