package com.masse.valentin.ecommerce.controllers;

import com.masse.valentin.ecommerce.models.User;
import com.masse.valentin.ecommerce.services.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> findAll(){
        return this.userService.findAll();
    }

    @GetMapping("id")
    public User findById(@PathVariable String id){
        return this.userService.findById(id);
    }

    @PostMapping
    public User create(@RequestBody User entity){
        return this.userService.create(entity);
    }

    @PutMapping
    public User update(@RequestBody User entity){
        return this.userService.update(entity);
    }

    @DeleteMapping("id")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void delete(@PathVariable String id){
        this.userService.delete(id);
    }

}
