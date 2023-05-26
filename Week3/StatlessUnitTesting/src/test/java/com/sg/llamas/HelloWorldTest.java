package com.sg.llamas;

import org.junit.jupiter.api.Test;

import static com.sg.llamas.HelloWorld.display;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloWorldTest {

    @Test
        void testHelloWorld() {
        boolean result = display();
         assertTrue(result, "It should be true");
    }
}