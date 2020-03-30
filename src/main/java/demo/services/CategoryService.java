package demo.services;

import demo.models.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
    Iterable<Category> findAll();

    Optional<Category> findById(Long id);

    void save(Category category);

    void remove(Long id);
    List<Category> findAllByNameContaining(String name);
}
