package demo.services;

import demo.models.Author;

import java.util.List;
import java.util.Optional;

public interface IAuthorService {
    Iterable<Author> findAllAuthor();
    Optional<Author> findById(Long id);
    void save(Author author);
    void remote(Long id);
    List<Author> findAllByNameContaining(String name);
}
