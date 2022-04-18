package lv.tsi.blog.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Posts")
public class BlogPost {
    @Id
    @JsonProperty
    Long id;

    @JsonProperty
    String author;

    @JsonProperty
    String name;

    @JsonProperty
    String postbody;
}
