package demo.services;

import demo.models.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    Iterable<Comment> findAll();

    Optional<Comment> findById(Long id);

    void save(Comment comment);

    void remove(Long id);

    List<Comment> findAllByBook_Id(Long idBook);
}
