package sg.com.fairtech.product.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import sg.com.fairtech.product.service.dto.ProductRequest;
import sg.com.fairtech.product.service.dto.ProductResponse;
import sg.com.fairtech.product.service.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public String createProduct(@RequestBody ProductRequest productRequest) {
        productService.createProduct(productRequest);
        return "Product Placed Successfully";
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts() {
        return productService.getAllProducts();
    }

}
