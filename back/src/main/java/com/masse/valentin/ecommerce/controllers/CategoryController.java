package com.masse.valentin.ecommerce.controllers;

import com.masse.valentin.ecommerce.models.Category;
import com.masse.valentin.ecommerce.services.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> findAll(){
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public Category findById(@PathVariable String id){
        return this.service.findById(id);
    }

    @PostMapping
    public Category create(@RequestBody Category entity){
        return this.service.create(entity);
    }

    @PutMapping
    public Category update(@RequestBody Category entity){
        return this.service.update(entity);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable String id){
        this.service.delete(id);
    }


}
