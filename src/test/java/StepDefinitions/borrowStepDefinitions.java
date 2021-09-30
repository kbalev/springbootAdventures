package StepDefinitions;

import alexandria.Book;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class borrowStepDefinitions {

    public Book testBook = new Book("Count of Monte Cristo");

    @Given("the book exists")
    public void bookExistsAndThat() {
        testBook.request();
    }

    @And("book is available")
    public void bookIsNotBorrowed() {
        testBook.setBorrowed(false);
    }

    @And("book is borrowed")
    public void bookIsBorrowed() {
        testBook.setBorrowed(true);
    }

    @When("the patron returns the book")
    public void thePatronReturnsTheBook() {
        testBook.bringBack();
    }

    @When("the patron borrows the book")
    public void thePatronBorrowsTheBook() {
        testBook.request();
    }

    @Then("when patron tries borrowing they should be told {string}")
    public void patronShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, testBook.borrow());
    }

}
