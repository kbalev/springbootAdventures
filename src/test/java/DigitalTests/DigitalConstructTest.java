package DigitalTests;

import alexandria.Digital;
import alexandria.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitalConstructTest {
    @Test
    void construcTestDigi(){
        Digital testDigi = new Movie("Kingdom of Heaven", "Historical Drama", 2005);
        assertEquals("I require a computer to be viewed", testDigi.requiredDevice(), "Doesn't know it is a digital medium.");
    }
}
