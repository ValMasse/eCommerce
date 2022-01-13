package com.masse.valentin.ecommerce.configuration;

import com.masse.valentin.ecommerce.repositories.AddressRepository;
import com.masse.valentin.ecommerce.services.impl.AddressService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public AddressService addressServiceFactory(AddressRepository repo){
        return new AddressService(repo);
    }
}
