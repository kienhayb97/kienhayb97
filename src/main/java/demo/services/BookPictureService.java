package demo.services;

import demo.models.BookPicture;

import java.util.Optional;

public interface BookPictureService {
    Iterable<BookPicture> findAllBookPicture();
    Optional<BookPicture> findById(Long id);
    void save(BookPicture bookPicture);
    void remote(Long id);
}
