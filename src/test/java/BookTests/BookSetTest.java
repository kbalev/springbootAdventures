package BookTests;

import alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookSetTest {
    Book testBook = new Book("Don Quixote", "Cervantes", "Lots of words, trust", 1065);
    @Test
    public void setTitleTest(){
        testBook.setTitle("Silmarilion");
        assertEquals("Silmarilion", testBook.getTitle() , "Still the same book");
    }
    @Test
    public void setAuthorTest(){
        testBook.setAuthor("Tolkein");
        assertEquals("Tolkein", testBook.getAuthor() , "Still the same author");
    }
    @Test
    public void setContentTest(){
        testBook.setContent("More words than there are in the previous iteration");
        assertEquals("More words than there are in the previous iteration", testBook.getContent() , "Still the same words");
    }
    @Test
    public void setPages(){
        testBook.setPages(5000);
        assertEquals(5000, testBook.getPages() , "Still the same number of pages");
    }
}
