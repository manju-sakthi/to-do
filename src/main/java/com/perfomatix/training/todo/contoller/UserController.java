package com.perfomatix.training.todo.contoller;

import com.perfomatix.training.todo.entity.User;
import com.perfomatix.training.todo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
private UserService userService;
    @PostMapping("/user")
    public User saveUser(@RequestBody User user){

        return userService.saveUser(user);
    }
    @DeleteMapping("/user/{id}")
    public String deleteUserById(@PathVariable("id") Integer id){
         userService.deleteUserById(id);
         return "DELETED";
    }
}
