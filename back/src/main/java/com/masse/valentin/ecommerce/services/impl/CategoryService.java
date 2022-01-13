package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.Category;
import com.masse.valentin.ecommerce.repositories.CategoryRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class CategoryService implements GenericService<Category> {

    private CategoryRepository repo;

    public CategoryService(CategoryRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Category> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Category findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Category create(Category entity) {
        return this.repo.save(entity);
    }

    @Override
    public Category update(Category entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
