package com.ms.user.service;

import com.ms.user.model.UserModel;
import com.ms.user.producer.UserProducer;
import com.ms.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserProducer userProducer;

    public UserModel save(UserModel userModel) {
        userModel=userRepository.save(userModel);
        userProducer.publishMessageEmail(userModel);
        return userModel;

    }
}
