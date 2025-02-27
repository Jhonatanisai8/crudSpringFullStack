package com.isai.crudspringbootfullstack.services;

import com.isai.crudspringbootfullstack.entitys.User;

import java.util.List;

public interface UserService {
    List<User> findAllUsers();

    User saveUser(User user);
}
