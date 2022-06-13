package com.masse.valentin.ecommerce.configuration;

import com.masse.valentin.ecommerce.repositories.CategoryRepository;
import com.masse.valentin.ecommerce.repositories.ProductRepository;
import com.masse.valentin.ecommerce.repositories.UserRepository;
import com.masse.valentin.ecommerce.services.impl.CategoryService;
import com.masse.valentin.ecommerce.services.impl.ProductService;
import com.masse.valentin.ecommerce.services.impl.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServicesConfig {

    @Bean
    public CategoryService categoryServiceFactory(CategoryRepository repo){
        return new CategoryService(repo);
    }

    @Bean
    public ProductService productServiceFactory(ProductRepository repo){
        return new ProductService(repo);
    }

    @Bean
    public UserService userServiceFactory(UserRepository repo){
        return new UserService(repo);
    }
}
