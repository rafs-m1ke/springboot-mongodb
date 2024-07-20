package com.rafsm1ke.springmongo.resources;

import com.rafsm1ke.springmongo.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria Brown", "maria@gmail.com");
        User alex = new User("1", "Alex Green", "alex@gmail.com");

        List<User> list = new ArrayList<>();

        list.addAll(Arrays.asList(maria, alex));

        return ResponseEntity.ok(list);
    }

}