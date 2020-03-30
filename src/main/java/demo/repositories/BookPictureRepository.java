package demo.repositories;

import demo.models.BookPicture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPictureRepository extends JpaRepository<BookPicture, Long> {
}
