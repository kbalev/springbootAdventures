package BookTests;

import alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookConstructorsTest {
    @Test
    public void bareBonesConstructor(){
        Book testBook1 = new Book("Fables");
        assertEquals("Fables", testBook1.getTitle(), "Not the right title");
        assertEquals("Author Unknown", testBook1.getAuthor(), "Incorrect default for author");
        assertEquals("Content to be added.", testBook1.getContent(), "Incorrect default for content.");
        assertEquals(0, testBook1.getPages(), "Incorrect default for pages");
    }
    @Test
    public void middleConstructorTest(){
        Book testBook2 = new Book("Epic of Gilgamesh", "Many, many lines about the wholesome friendship between Gilgamesh and Enkidu");
        assertEquals("Epic of Gilgamesh", testBook2.getTitle(), "This ain't it chief");
        assertEquals("Author Unknown", testBook2.getAuthor(), "I shouldn't know who wrote this");
        assertEquals("Many, many lines about the wholesome friendship between Gilgamesh and Enkidu", testBook2.getContent(), "Where's my wholesome story?");
        assertEquals(1, testBook2.getPages(), "Calculation and/or rounding has gone wrong");
    }
}
