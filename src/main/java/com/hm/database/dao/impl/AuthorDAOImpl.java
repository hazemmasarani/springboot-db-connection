package com.hm.database.dao.impl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hm.database.dao.AuthorDAO;

public class AuthorDAOImpl implements AuthorDAO{

    private final JdbcTemplate jdbcTemplate;

    public AuthorDAOImpl(final JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
}
