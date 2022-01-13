package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.User;
import com.masse.valentin.ecommerce.repositories.UserRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class UserService implements GenericService<User> {

    private UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<User> findAll() {
        return this.repo.findAll();
    }

    @Override
    public User findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public User create(User entity) {
        return this.repo.save(entity);
    }

    @Override
    public User update(User entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
