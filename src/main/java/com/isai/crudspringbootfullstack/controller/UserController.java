package com.isai.crudspringbootfullstack.controller;

import com.isai.crudspringbootfullstack.entitys.User;
import com.isai.crudspringbootfullstack.services.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.List;

@Controller
@SessionAttributes("user")
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

    @GetMapping("/saveUser")
    public String formSaveUser(Model model) {
        String title = "Save User";
        model.addAttribute("title", title);
        model.addAttribute("user", new User());
        return "saveUserCrud";
    }

    @PostMapping("/saveUser")
    public String saveUser(User user, Model model, SessionStatus status) {
        service.saveUser(user);
        model.addAttribute("user", user);
        status.setComplete();
        return "redirect:/users";
    }

}
