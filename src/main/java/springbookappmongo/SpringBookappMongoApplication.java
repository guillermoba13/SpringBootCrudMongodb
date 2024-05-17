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
		
		// insert
		Book book = new Book();
		book.setBookId(3);
		book.setTitle("Tecnología");
		book.setAuthor("Jose");
		book.setCategory("TICs");
		book.setCost(200.00);
		bookService.addBook(book);
		
		// get all
		bookService.getAll().forEach(System.out::println);
		
		// find
		Book nbook = bookService.findById(1);
		System.out.println(nbook.getAuthor());
		
		// update
		bookService.updateBook(2, 200);
		
		// delete
		bookService.deleteBook(1);		
	}

}
