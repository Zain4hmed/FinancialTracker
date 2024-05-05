package com.financial.tracker.service;

import com.financial.tracker.entity.User;
import com.financial.tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
      return  userRepository.findAll();
    }

}
