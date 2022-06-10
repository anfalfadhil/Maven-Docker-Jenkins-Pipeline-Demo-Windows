package com.cognixia.jump.jenkins;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

public class DemoAppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new DemoApp();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        DemoApp.main(null);
        try {
            assertEquals("Hello World from our Jenkins Pipeline Demo!! :)" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World from our Jenkins Pipeline Demo!! :)\"");
        }
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
