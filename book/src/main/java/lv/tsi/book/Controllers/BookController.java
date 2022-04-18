package lv.tsi.book.Controllers;

import lv.tsi.book.Models.Book;
import lv.tsi.book.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private final BookRepository repository;

    public BookController(BookRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getbooks")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/getbook/{id}")
    public ResponseEntity<Book> getAllBookId(@PathVariable Long id){
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        var saveBook = repository.save(book);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveBook);
    }
}
