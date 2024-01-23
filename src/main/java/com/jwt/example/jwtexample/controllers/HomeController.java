package com.jwt.example.jwtexample.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.jwtexample.models.User;
import com.jwt.example.jwtexample.services.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {
   @Autowired
    private UserService userService;


    @GetMapping("/user")
  public List<User> getUser(){
    System.out.println("Mohammad Azhan Pasha");
    return this.userService.getUsers();
  }
}
