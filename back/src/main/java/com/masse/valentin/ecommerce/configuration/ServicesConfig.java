package com.masse.valentin.ecommerce.configuration;

import com.masse.valentin.ecommerce.repositories.CategoryRepository;
import com.masse.valentin.ecommerce.services.impl.CategoryService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public CategoryService categoryServiceFactory(CategoryRepository repo){
        return new CategoryService(repo);
    }
}
