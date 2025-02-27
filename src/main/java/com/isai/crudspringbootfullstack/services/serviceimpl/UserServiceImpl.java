package com.isai.crudspringbootfullstack.services.serviceimpl;

import com.isai.crudspringbootfullstack.entitys.User;
import com.isai.crudspringbootfullstack.repository.UserRepository;
import com.isai.crudspringbootfullstack.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl
        implements UserService {

    @Autowired
    private UserRepository repository;

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }
}
