package com.cybermakers.articlesbucket.repositories;

import com.cybermakers.articlesbucket.entities.Authors;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface AuthorsRepository extends MongoRepository<Authors, UUID> {
}
