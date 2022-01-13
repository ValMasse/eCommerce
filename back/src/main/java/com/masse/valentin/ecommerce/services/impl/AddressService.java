package com.masse.valentin.ecommerce.services.impl;

import com.masse.valentin.ecommerce.models.Address;
import com.masse.valentin.ecommerce.repositories.AddressRepository;
import com.masse.valentin.ecommerce.services.GenericService;

import java.util.List;

public class AddressService implements GenericService<Address> {

    private AddressRepository repo;

    public AddressService(AddressRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Address> findAll() {
        return this.repo.findAll();
    }

    @Override
    public Address findById(String id) {
        return this.repo.findById(id).get();
    }

    @Override
    public Address create(Address entity) {
        return this.repo.save(entity);
    }

    @Override
    public Address update(Address entity) {
        return this.repo.save(entity);
    }

    @Override
    public void delete(String id) {
        this.repo.deleteById(id);
    }
}
