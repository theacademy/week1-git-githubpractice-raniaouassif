package com.sg.llamas;

import org.junit.jupiter.api.Test;

import static com.sg.llamas.HappyLlamas.areTheLlamasHappy;
import static org.junit.jupiter.api.Assertions.*;

import  com.sg.llamas.HappyLlamas;


//Normal Trampoline Tests
//        areTheLlamasHappy(false, 10) → false
//        areTheLlamasHappy(false, 24) → true
//        areTheLlamasHappy(false, 30) → true
//        areTheLlamasHappy(false, 42) → true
//        areTheLlamasHappy(false, 50) → false
//        Ultra Bounce Trampoline Tests
//        areTheLlamasHappy(true, 10) → false
//        areTheLlamasHappy(true, 24) → true
//        areTheLlamasHappy(true, 30) → true
//        areTheLlamasHappy(true, 42) → true
//        areTheLlamasHappy(true, 50) → true
class HappyLlamasTest {

    public HappyLlamasTest() {
    }
//    @org.junit.jupiter.api.Test
//    void areTheLlamasHappy() {
//    }

    @org.junit.jupiter.api.Test
    public void testSomeMethod() {
    }

    @Test
    public void testNormalTrampoline10() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 10;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "10 Llamas w/ Normal Trampolines should be Unhappy!" );
    }

    @Test
    public void testNormalTrampoline24() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 24;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "24 Llamas w/ Normal Trampolines should be Happy!" );
    }

    @Test
    public void testNormalTrampoline30() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 30;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "30 Llamas w/ Normal Trampolines should be Happy!" );
    }

    @Test
    public void testNormalTrampoline42() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 42;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertTrue( result , "42 Llamas w/ Normal Trampolines should be Happy!" );
    }

    @Test
    public void testNormalTrampoline50() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = false;
        int numTrampolines = 50;

        // ACT - for simple methods, this generally means calling the method under test
        // and then capturing its return to assert on
        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        // ASSERT - basically just a conditional that proves the result is what
        // you expect it to be, plus an extra message to display if it doesn't match.
        //
        // There are a wide variety of assert types, here we
        // just want to assert that it returned false. But we could have also used
        // assertEquals and passed in a false value.

        assertFalse( result , "50 Llamas w/ Normal Trampolines should be Unhappy!" );
    }


    @Test
    public void ultraBounceTrampoline10() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 10;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertFalse( result , "10 Llamas w/ Ultra Bounce Trampoline should be Unhappy!" );

    }

    @Test
    public void ultraBounceTrampoline24() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 24;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertTrue( result , "24 Llamas w/ Ultra Bounce Trampoline should be Happy!" );

    }

    @Test
    public void ultraBounceTrampoline30() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 30;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertTrue( result , "30 Llamas w/ Ultra Bounce Trampoline should be Happy!" );

    }

    @Test
    public void ultraBounceTrampoline42() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 42;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertTrue( result , "42 Llamas w/ Ultra Bounce Trampoline should be Happy!" );

    }

    @Test
    public void ultraBounceTrampoline50() {
        // ARRANGE - for simple methods, this means setting up the parameters
        boolean isNasaFabric = true;
        int numTrampolines = 50;

        boolean result = areTheLlamasHappy(isNasaFabric, numTrampolines);

        assertTrue( result , "50 Llamas w/ Ultra Bounce Trampoline should be Happy!" );

    }


}