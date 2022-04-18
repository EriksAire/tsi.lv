package lv.tsi.webshop.Services;

import lombok.RequiredArgsConstructor;
import lv.tsi.webshop.Models.Product;
import lv.tsi.webshop.Repository.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public ResponseEntity<List<Product>> getAllProducts(){
        return ResponseEntity.ok(productRepository.findAll());
    }

    public ResponseEntity<Product> getProductById(Long id){
        var product = productRepository.findById(id);

        if(product.isPresent()){
            return ResponseEntity.ok(product.get());
        }
        else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    public Product addProduct(Product product){
        return productRepository.save(product);
    }
}
