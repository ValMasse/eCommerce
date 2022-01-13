package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.Product;
import com.masse.valentin.ecommerce.repositories.ProductRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class ProductService implements GenericService<Product> {

    private ProductRepository repo;

    public ProductService(ProductRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Product> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Product findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Product create(Product entity) {
        return this.repo.save(entity);
    }

    @Override
    public Product update(Product entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
