package lv.tsi.book.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Book")
public class Book {
    @Id
    @JsonProperty
    Long id;

    @JsonProperty
    String author;

    @JsonProperty
    String name;

    @JsonProperty
    int copies;
}
