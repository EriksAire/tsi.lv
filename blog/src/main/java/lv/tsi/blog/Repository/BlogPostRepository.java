package lv.tsi.blog.Repository;

import lv.tsi.blog.Models.BlogPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface BlogPostRepository extends JpaRepository<BlogPost, Long> {
}
