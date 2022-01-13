package com.masse.valentin.ecommerce.controllers;

import com.masse.valentin.ecommerce.services.impl.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("addresses")
public class AddressController {

    @Autowired
    private AddressService service;


}
