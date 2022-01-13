package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.OrderLine;
import com.masse.valentin.ecommerce.repositories.OrderLineRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class OrderLineService implements GenericService<OrderLine> {

    private OrderLineRepository repo;

    public OrderLineService(OrderLineRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<OrderLine> findAll() {
        return this.repo.findAll();
    }

    @Override
    public OrderLine findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public OrderLine create(OrderLine entity) {
        return this.repo.save(entity);
    }

    @Override
    public OrderLine update(OrderLine entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
