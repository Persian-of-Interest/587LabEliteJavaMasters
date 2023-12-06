import org.junit.Test;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class InvalidArgTest {

    @Test
    public void testInvalidInputResponse() throws IOException {
        ProcessBuilder builder = new ProcessBuilder("python", "path/to/MyThermo.py", "-invalidarg");
        Process process = builder.start();

        // Read the output from the process
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        StringBuilder output = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            output.append(line);
        }

        // Check if the output contains a user-friendly error message
        assertTrue(output.toString().contains("Invalid argument, use --help for valid arguments"));
    }
}
