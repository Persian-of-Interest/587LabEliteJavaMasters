import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestingResponses {

    @Test
    public void testInvalidResponseErrorMessage() {
        String invalidResponse = getInvalidResponse();

        if (isInvalidResponse(invalidResponse)) {
            String errorMessage = generateErrorMessage(invalidResponse);
            assertEquals("Invalid response error message", "Error: Invalid response - " + invalidResponse, errorMessage);
        }
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
}
