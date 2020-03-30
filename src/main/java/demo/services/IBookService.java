package demo.services;

import demo.models.Book;

import java.util.List;
import java.util.Optional;

public interface IBookService {
    Iterable<Book> findAllBook();
    Optional<Book> findById(Long id);
    void save(Book book);
    void remote(Long id);
    List<Book> findAllByCategory(Long id);
    List<Book> findAllByNameContaining(String name);
}
