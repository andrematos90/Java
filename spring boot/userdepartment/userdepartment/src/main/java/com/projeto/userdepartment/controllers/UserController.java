package com.projeto.userdepartment.controllers;

import com.projeto.userdepartment.entities.User;
import com.projeto.userdepartment.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/users")
public class UserController {
    @Autowired
    private UserRepository repository;
    @GetMapping
    public List<User> findAll(){
        List<User> result = repository.findAll();
        return result;
    }
    @GetMapping(value= "/{id}")
    public User getById(@PathVariable Long id){
        User result = repository.findById(id).get();
        return result;
    }

    @PostMapping
    public User insertUser(@RequestBody User user){
        User result = repository.save(user);
        return result;
    }
}
