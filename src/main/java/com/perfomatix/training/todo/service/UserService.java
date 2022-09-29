package com.perfomatix.training.todo.service;

import com.perfomatix.training.todo.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
  public User saveUser(User user);

 public void deleteUserById(Integer id);
}
