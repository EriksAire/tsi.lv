package lv.tsi.book.Repository;

import lv.tsi.book.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface BookRepository extends JpaRepository<Book, Long> {
}
