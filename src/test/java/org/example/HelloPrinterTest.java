package org.example;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloPrinterTest {

    @Test
    void testPrintHelloWorld() {
        // Capture System.out
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Call the SDK function
        HelloPrinter.printHelloWorld();

        // Restore System.out
        System.setOut(originalOut);

        // Verify the output
        String output = outContent.toString().trim();
        assertEquals("Hello World-1", output);
    }
}
