package com.softwareinstitute.training.keiran.springbootForays.springbotForays;

import alexandria.Book;
import alexandria.Game;
import alexandria.Inventory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;


@SpringBootApplication
@RestController
public class SpringbotForaysApplication {

	public static void main(String[] args)  {
		SpringApplication.run(SpringbotForaysApplication.class, args);
	}

	@CrossOrigin("http://localhost:3000")
	@GetMapping("/deeperDown")
	public String reqResponse(){
		Book defaultBook = new Book("Rime of the Ancient Mariner");
		return defaultBook.toString();
	}

	@CrossOrigin("http://localhost:3000")
	@PostMapping("/singleBook")
	public String singleBook(String bookTitle){
		Book theBook = new Book(bookTitle);
		return theBook.toString();
	}
	@CrossOrigin("http://localhost:3000")
	@GetMapping("/singleGame")
	public String singleGame(String gameTitle){
		Game theGame = new Game(gameTitle);
		return theGame.toString();
	}
}
