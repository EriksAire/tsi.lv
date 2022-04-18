package lv.tsi.webshop.Models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product")
public class Product {
    enum ProductCategory{
        COMPUTERS,
        SMARTPHONES,
        SMART_HOME_DEVICES
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @JsonProperty
    String name;

    @JsonProperty
    String description;

    @JsonProperty
    float price;

    @JsonProperty
    String pictureurl;

   @JsonProperty
    @Enumerated(EnumType.STRING)
    ProductCategory productcategory;
}
