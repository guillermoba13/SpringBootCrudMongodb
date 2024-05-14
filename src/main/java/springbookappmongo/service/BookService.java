package springbookappmongo.service;

import java.util.List;

import springbookappmongo.model.Book;

public interface BookService {

	Book addBook(Book book);
	List<Book> getAll();
	List<Book> getByAuthor(String author);
	List<Book> getByCategory(String category);
	Book findById(int bookId);
	void updateBook(int bookId, double price);
	void deleteBook(int bookId);
}
