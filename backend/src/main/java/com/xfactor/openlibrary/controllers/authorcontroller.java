package com.xfactor.openlibrary.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Author;
import com.xfactor.openlibrary.repository.AuthorRepository;

@RestController
@RequestMapping("author")
public class authorcontroller {
    //ArrayList<Author> lauthor = new ArrayList<>();
    
    private AuthorRepository authorRepository;


    public authorcontroller(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @PostMapping("/saveauthor")
    public Author saveauthor(@RequestBody Author auth){
        if(auth.getId() == null){
            Author auth1 = authorRepository.save(auth);
            return auth1;
        } 
        return null;
    }

    @PutMapping("/updateauthor")
    public Author updateauthor(@RequestBody Author auth){
        if(auth.getId() != null){
            Author auth1 = authorRepository.save(auth);
            return auth1;
        } 
        return null;
    }


    @GetMapping("/getAllauthors")
    public List<Author> getallauthors(){
        return authorRepository.findAll();
    }

    @GetMapping("/searchbyid/{id}")
    public Author getAuthorbyId(@PathVariable int id){
        Optional<Author> optional = authorRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("/findallcount")
    public long findallcount(){
        return authorRepository.count();
    }

    @GetMapping("/deleteauthor/{id}")
    public void deletebyid(@PathVariable int id){
        authorRepository.deleteById(id);
    }
    
}