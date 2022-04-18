package lv.tsi.blog.Controllers;

import lv.tsi.blog.Models.BlogPost;
import lv.tsi.blog.Repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogController {
    @Autowired
    private final BlogPostRepository repository;

    public BlogController(BlogPostRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/getposts")
    public ResponseEntity<List<BlogPost>> getAllPosts(){
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/getpost/{id}")
    public ResponseEntity<BlogPost> getPostById(@PathVariable Long id){
        return repository.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @PostMapping("/post")
    public ResponseEntity<BlogPost> addPost(@RequestBody BlogPost post){
        var savePost = repository.save(post);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(savePost);
    }
}
