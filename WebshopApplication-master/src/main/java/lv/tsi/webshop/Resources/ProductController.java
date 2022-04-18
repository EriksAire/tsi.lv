package lv.tsi.webshop.Resources;

import lombok.RequiredArgsConstructor;
import lv.tsi.webshop.Models.Product;
import lv.tsi.webshop.Services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class ProductController {
    private final ProductService productService;

    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/product/{id}")
    public ResponseEntity getProductById(@PathVariable Long id) {
        return productService.getProductById(id);

    }

    @PostMapping("/product")
    public ResponseEntity<Product> addProduct(@RequestBody Product product) {
        var saveProduct = productService.addProduct(product);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveProduct);
    }
}
