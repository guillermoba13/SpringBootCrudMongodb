package springbookappmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import springbookappmongo.model.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
