package com.isai.crudspringbootfullstack.repository;

import com.isai.crudspringbootfullstack.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository
        extends JpaRepository<User, Long> {
}
