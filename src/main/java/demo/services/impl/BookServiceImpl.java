package demo.services.impl;

import demo.models.Book;
import demo.repositories.BookRepository;
import demo.services.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Iterable<Book> findAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Optional<Book> findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void remote(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> findAllByCategory(Long id) {
        return bookRepository.findAllByCategory_Id(id);
    }

    @Override
    public List<Book> findAllByNameContaining(String name) {
        return bookRepository.findAllByNameContaining(name);
    }
}
