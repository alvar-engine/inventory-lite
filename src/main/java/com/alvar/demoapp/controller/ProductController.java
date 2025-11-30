package com.alvar.demoapp.controller;

import com.alvar.demoapp.model.Product;
import com.alvar.demoapp.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService service;

    public ProductController(ProductService service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getAll() {
        return service.findAll();
    }

    @PostMapping
    public Product create(@RequestBody Product product) {
        return service.save(product);
    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product updatedProduct) {
        return service.updateProduct(id, updatedProduct)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}