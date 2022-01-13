package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.Delivery;
import com.masse.valentin.ecommerce.repositories.DeliveryRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class DeliveryService implements GenericService<Delivery> {

    private DeliveryRepository repo;

    public DeliveryService(DeliveryRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Delivery> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Delivery findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Delivery create(Delivery entity) {
        return this.repo.save(entity);
    }

    @Override
    public Delivery update(Delivery entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
