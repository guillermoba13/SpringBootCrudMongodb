package springbookappmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springbookappmongo.model.Book;
import springbookappmongo.service.BookService;

@SpringBootApplication
public class SpringBookappMongoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringBookappMongoApplication.class, args);
	}
	
	@Autowired
	BookService bookService;
	
	@Override
	public void run(String... args) throws Exception{
		
		Book book = new Book();
		book.setBookId(1);
		book.setTitle("");
		book.setAuthor("");
		book.setCategory("");
		book.setCost(100.00);
		bookService.addBook(book);
				
	}

}
