package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
@Autowired
    userservice userservice;


@RequestMapping("/list")
    public List<user> findAllById(Iterable<String> iterable) {
        return userservice.findAllById( iterable );
    }


    @PostMapping("/all")
    @ResponseBody
    public List<user> findAll() {
        return userservice.findAll();
    }

}
