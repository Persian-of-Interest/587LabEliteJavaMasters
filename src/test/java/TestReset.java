import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class TestReset {

    private ProcessBuilder pb;
    private BufferedReader br;
    private URL scriptPath = ClassLoader.getSystemResource("MyThermo.py");

    @Before
    public void setup() {
        List<String> cm = new ArrayList<>();
        cm.add("python3");
        cm.add(scriptPath.getPath());
        cm.add("--reset");
        pb = new ProcessBuilder(cm);
    }

    @Test
    public void testResetThermo() throws IOException {
        Process p = pb.start();
        String result = new String(p.getInputStream().readAllBytes());
        System.out.println(result);
        assertTrue(result.contains("The values are reset to defaults 69, 73"));
    }
}
