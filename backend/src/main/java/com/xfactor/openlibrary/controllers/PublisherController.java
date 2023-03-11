package com.xfactor.openlibrary.controllers;
import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Publisher;
import com.xfactor.openlibrary.repository.PublisherRepository;

@RestController
@RequestMapping("publisher")
public class PublisherController {

    private PublisherRepository publisherRepository;

    //ArrayList<Publisher> lpub = new ArrayList<>();
    
    public PublisherController(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }


    @PostMapping("/savebook")
    public Publisher savepublish(@RequestBody Publisher publish){   
        if(publish.getId() == null){
            Publisher publish1 = publisherRepository.save(publish);
        }
        return null;
    }

    @PutMapping("/updatepublisher")
    public Publisher updatepublish(@RequestBody Publisher publish){   
        if(publish.getId() != null){
            Publisher publish1 = publisherRepository.save(publish);
            return publish1;
        }
        return null;
    }

    @GetMapping("/getAll")
    public List<Publisher> getAllPublishes(){
        return publisherRepository.findAll();
    }

    @GetMapping("getbyid/{id}")
    public Publisher findbyid(@PathVariable int id){
        Optional<Publisher> optional= publisherRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("/findallcount")
    public long findtotal(){
        return publisherRepository.count();
    }

    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable int id){
        publisherRepository.deleteById(id);
    }
}