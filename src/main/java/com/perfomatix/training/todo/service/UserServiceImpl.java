package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.User;
import com.perfomatix.training.todo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
         userRepository.deleteById(id);
    }
}
