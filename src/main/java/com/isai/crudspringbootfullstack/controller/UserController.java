package com.isai.crudspringbootfullstack.controller;

import com.isai.crudspringbootfullstack.entitys.User;
import com.isai.crudspringbootfullstack.services.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping("/users")
    public String findAllUsers(Model model) {
        List<User> users = service.findAllUsers();
        String title = "All Users";
        model.addAttribute("users", users);
        model.addAttribute("title", title);
        return "users";
    }
}
