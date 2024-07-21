package com.rafsm1ke.springmongo.services;

import com.rafsm1ke.springmongo.domain.Post;
import com.rafsm1ke.springmongo.repositories.PostRepository;
import com.rafsm1ke.springmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> post = repo.findById(id);
        return post.orElseThrow(() -> new ObjectNotFoundException("User not found"));
    }

}
