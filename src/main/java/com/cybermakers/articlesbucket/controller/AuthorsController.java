package com.cybermakers.articlesbucket.controller;

import com.cybermakers.articlesbucket.entities.Authors;
import com.cybermakers.articlesbucket.services.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.net.URI;

@RestController
@RequestMapping
public class AuthorsController {

    private final AuthorsService authorsService;

    @Autowired
    public AuthorsController(AuthorsService authorsService){
        this.authorsService = authorsService;
    }

    @GetMapping
    public ResponseEntity<List<Authors>> listAuthors() {
        return  ResponseEntity.ok(this.authorsService.authorsList());
    }

    @PostMapping
    public ResponseEntity<Authors> createAuthors(@Valid @RequestBody Authors newAuthors, UriComponentsBuilder uriComponentsBuilder) {
        Authors createdAuthors = this.authorsService.createAuthors(newAuthors);

        URI  uri = uriComponentsBuilder.path("/authors/").buildAndExpand(createdAuthors.getEmail()).toUri();

        return ResponseEntity.created(uri).body(createdAuthors);
    }

}
