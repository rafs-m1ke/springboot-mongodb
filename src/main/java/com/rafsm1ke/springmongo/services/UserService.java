package com.rafsm1ke.springmongo.services;

import com.rafsm1ke.springmongo.domain.User;
import com.rafsm1ke.springmongo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
