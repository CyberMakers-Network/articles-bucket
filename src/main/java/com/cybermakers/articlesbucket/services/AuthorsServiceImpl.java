package com.cybermakers.articlesbucket.services;

import com.cybermakers.articlesbucket.entities.Authors;
import com.cybermakers.articlesbucket.repositories.AuthorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorsServiceImpl implements AuthorsService{

    private final AuthorsRepository authorsRepository;

    @Autowired
    public AuthorsServiceImpl (AuthorsRepository authorsRepository){
        this.authorsRepository = authorsRepository;
    }

    @Override
    public List<Authors> authorsList() {
        return this.authorsRepository.findAll();
    }

    @Override
    public Authors createAuthors(Authors newAuthors) {
        return this.authorsRepository.save(newAuthors);
    }

    @Override
    public Authors updateAuthors() {
        return null;
    }

    @Override
    public void deleteAuthors() {
    }
}
