package com.example.demo.controller;

import com.example.demo.entity.user;
import com.example.demo.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class userController {
@Autowired
    userservice userservice;

@PostMapping(value="list")
    public String findAllById(user user) {
    Integer id= user.getId();
    userservice.findAllById( id);
    return "list";
    }
    @RequestMapping("list")
    @ResponseBody
    public List<user> findAllById1(user user) {
       return userservice.findAllById(user.getId());
    }

    @GetMapping ("/all")
    @ResponseBody
    public List<user> findAll() {
        return userservice.findAll();
    }

    @RequestMapping("index")
    public String index(){

    return "all";
    }
    @RequestMapping("login")
    public String login(){

    return "login";
    }
    @PostMapping  ("/all1")
    @ResponseBody
    public List<user> findAll1() {
        return userservice.findAll();
    }

    @RequestMapping("login1")
    public String login1(){

        return "login1";
    }


}
