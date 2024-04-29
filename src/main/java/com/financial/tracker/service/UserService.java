package com.financial.tracker.service;

import com.financial.tracker.entity.UserEntity;
import com.financial.tracker.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity user) {
        user.setUserId(UUID.randomUUID().toString());
        return userRepository.save(user);
    }

    public List<UserEntity> getAllUsers(){
      return  userRepository.findAll();
    }

}
