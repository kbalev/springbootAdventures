package MovieTests;

import alexandria.Movie;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MovieSetGetTest {

    @Test
    void setTitle() {
        Movie testMovie1 = new Movie("300", "Action", 2006);
        testMovie1.setTitle("300: Rise of a Nation");
        assertEquals("300: Rise of a Nation", testMovie1.getTitle(), "Wrong movie title.");
    }

    @Test
    void setGenre() {
        Movie testMovie2 = new Movie("300", "Action", 2006);
        testMovie2.setGenre("Historical Action");
        assertEquals("Historical Action", testMovie2.getGenre(), "Wrong genre.");
    }

    @Test
    void setReleaseYear() {
        Movie testMovie3 = new Movie("300", "Action", 2006);
        testMovie3.setReleaseYear(3000);
        assertEquals(3000, testMovie3.getReleaseYear(), "Wrong release year.");
    }
}