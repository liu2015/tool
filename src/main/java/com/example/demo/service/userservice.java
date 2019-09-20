package com.example.demo.service;

import com.example.demo.Repository.userRepository;
import com.example.demo.entity.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userservice {

    @Autowired
    userRepository userRepository;

    public List<user> findAllById(Integer id) {
        return (List<user>) userRepository.findAllById( id );
    }

    public List<user> findAll() {
        return userRepository.findAll();
    }
}
