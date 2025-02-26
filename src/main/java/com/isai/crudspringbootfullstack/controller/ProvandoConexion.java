package com.isai.crudspringbootfullstack.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProvandoConexion {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProvandoConexion(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/testConnection")
    public String testConnection() {
        try {
            jdbcTemplate.execute("DROP TABLE IF EXISTS usuario");
            return "Connection established";
        } catch (Exception e) {
            return "Connection failed " + e.getMessage();
        }
    }

}
