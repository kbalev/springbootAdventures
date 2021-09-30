package InventoryTests;

import alexandria.Book;
import alexandria.Inventory;
import alexandria.Physical;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BorrowingTest {

    @Test
    public void requestTest(){
        Inventory testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("Your book is available for collection, please proceed to the next step.", testBook.request(), "Book is not available for borrowing at creation");
    }
    @Test
    public void requestFailTest(){
        Inventory testBook1 = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook1.borrow();
        assertEquals("Unfortunately, your book is not available at this time. Please try again later.", testBook1.request(), "Book should not be available for borrowing at this point.");
    }
    @Test
    public void borrowTest(){
        Physical testBook2 = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("You have borrowed this item.", testBook2.borrow(), "Borrowing does not correctly flag a book as borrowed");
    }
    @Test
    public void borrowFailTest(){
        Physical testBook3 = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook3.borrow();
        assertEquals("The item you are trying to borrow is not available at this time.", testBook3.borrow(), "Borrowing does not correctly flag a book as borrowed");

    }
    @Test
    public void bringBackTest(){
        Book testBook4 = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook4.borrow();
        assertEquals("Thank you for bringing back the item.", testBook4.bringBack(), "Returning a book does not work as intended.");
    }
    @Test
    public void bringBackFailTest(){
        Book testBook5 = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("You cannot return an item that has not been borrowed.", testBook5.bringBack(), "Returning a book does not work as intended.");

    }
}
