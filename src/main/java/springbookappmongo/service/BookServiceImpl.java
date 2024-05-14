package springbookappmongo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springbookappmongo.model.Book;
import springbookappmongo.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	@Override
	public Book addBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public List<Book> getByAuthor(String author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getByCategory(String category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book findById(int bookId) {
		// TODO Auto-generated method stub
		Optional<Book> bookOpt = bookRepository.findById(bookId);
		if (bookOpt.isPresent()) {
			return bookOpt.get();
		}
		return null;
	}

	@Override
	public void updateBook(int bookId, double price) {
		// TODO Auto-generated method stub
		Book book = bookRepository.findById(bookId).get();
		book.setCost(price);
		bookRepository.save(book);
	}

	@Override
	public void deleteBook(int bookId) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(bookId);
	}

}
