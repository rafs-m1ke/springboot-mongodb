package com.rafsm1ke.springmongo.services;

import com.rafsm1ke.springmongo.domain.User;
import com.rafsm1ke.springmongo.repositories.UserRepository;
import com.rafsm1ke.springmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

    public User findById(String id) {
        Optional<User> user = repo.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }
}
