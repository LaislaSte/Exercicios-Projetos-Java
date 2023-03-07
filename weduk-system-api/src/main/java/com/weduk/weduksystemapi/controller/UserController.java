package com.weduk.weduksystemapi.controller;

import com.weduk.weduksystemapi.model.UserModel;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @GetMapping(path = "/api/users/{id}")
    public String showUser(@PathVariable("id") Integer id){
        return "all users"+id;
    }

    @PostMapping(path = "/api/user/register")
    public UserModel saveUser(@RequestBody UserModel user) {
        return user;
    }

    @PutMapping(path = "/api/user&&{id}/update")
    public UserModel updateUser(@RequestBody UserModel user){

        return user;
    }
}
