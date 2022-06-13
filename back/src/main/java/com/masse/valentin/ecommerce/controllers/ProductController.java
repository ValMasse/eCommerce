package com.masse.valentin.ecommerce.controllers;

import com.masse.valentin.ecommerce.models.Product;
import com.masse.valentin.ecommerce.services.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("products")
public class ProductController {

    @Autowired
    private ProductService service;

    //public ProductController(ProductService service) {this.service = service;}

    @GetMapping
    public List<Product> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Product findById(@PathVariable String id){
        return this.service.findById(id);
    }

    @PostMapping
    public Product create(@RequestBody Product entity){
        return this.service.create(entity);
    }

    @PutMapping
    public Product update(@RequestBody Product entity){
        return this.service.update(entity);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable String id){
        this.service.delete(id);
    }
}
