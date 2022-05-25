package com.cybermakers.articlesbucket.services;

import com.cybermakers.articlesbucket.entities.Authors;

import java.util.List;

public interface AuthorsService {

    List<Authors> authorsList();
    Authors createAuthors(Authors newAuthors);
    Authors updateAuthors();
    void deleteAuthors();
}
