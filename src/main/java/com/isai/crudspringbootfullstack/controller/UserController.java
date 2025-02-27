package com.isai.crudspringbootfullstack.controller;

import com.isai.crudspringbootfullstack.entitys.User;
import com.isai.crudspringbootfullstack.services.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserServiceImpl service;

    @GetMapping("/users")
    public String findAllUsers(Model model) {
        List<User> usersFrontend = service.findAllUsers();
        String title = "All Users";
        String subtitle = "All Users";
        model.addAttribute("usersFrontend", usersFrontend);
        model.addAttribute("subtitle", subtitle);
        model.addAttribute("title", title);
        return "usersCrud";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute User user) {
        service.saveUser(user);
        return "redirect:/users";
    }

}
