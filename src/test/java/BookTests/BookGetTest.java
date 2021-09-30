package BookTests;

import alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookGetTest {
    Book testBook = new Book("Don Quixote", "Cervantes", "Lots of words, trust", 1065);

    @Test
    public void testGetAuthor(){
        assertEquals("Cervantes", testBook.getAuthor(), "Wrong guy");
    }
    @Test
    public void testGetTitle(){
        assertEquals("Don Quixote", testBook.getTitle(),"Wrong book");
    }
    @Test
    public void testGetContent(){
        assertEquals("Lots of words, trust", testBook.getContent(), "Book empty");
    }
    @Test
    public void testGetPages(){
        assertEquals(1065, testBook.getPages(), "Wrong number");
    }
}
