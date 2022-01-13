package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.Order;
import com.masse.valentin.ecommerce.repositories.OrderRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class OrderService implements GenericService<Order> {

    private OrderRepository repo;

    public OrderService(OrderRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Order> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Order findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Order create(Order entity) {
        return this.repo.save(entity);
    }

    @Override
    public Order update(Order entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
