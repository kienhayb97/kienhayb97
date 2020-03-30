package demo.services.impl;

import demo.models.BookPicture;
import demo.repositories.BookPictureRepository;
import demo.services.BookPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BookPictureServiceImpl implements BookPictureService {
    @Autowired
    BookPictureRepository bookPictureRepository;

    @Override
    public Iterable<BookPicture> findAllBookPicture() {
        return bookPictureRepository.findAll();
    }

    @Override
    public Optional<BookPicture> findById(Long id) {
        return bookPictureRepository.findById(id);
    }

    @Override
    public void save(BookPicture bookPicture) {
        bookPictureRepository.save(bookPicture);
    }

    @Override
    public void remote(Long id) {
        bookPictureRepository.deleteById(id);
    }
}
