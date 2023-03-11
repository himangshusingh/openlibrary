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

import com.xfactor.openlibrary.domain.Book;
import com.xfactor.openlibrary.repository.BookRepository;

@RestController
@RequestMapping("books")
public class bookcontroller {

    private BookRepository bookRepository;
    
    public bookcontroller(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    //ArrayList<Book> lbooks = new ArrayList<>();
    
    @PostMapping("/savebook")
    public Book savebook(@RequestBody Book book){
        if(book.getId() == null){   
            Book book1 = bookRepository.save(book);
            return book1;
        }
        return null;
    }

    
    
    @PutMapping("/updatebook")
    public Book updatebook(@RequestBody Book book){
        if(book.getId() != null){
            Book book1 = bookRepository.save(book);
            return book1;
        }
        return null;
    }
    @GetMapping("/getAll")
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
        //return lbooks;

    }

    @GetMapping("/getbyid/{id}")
    public Book findbyid(@PathVariable int id){
        Optional<Book> optional= bookRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("/getbyisbn/{isbn}")
    public List<Book> findbyIsbn(@PathVariable String isbn){
        List<Book> books= bookRepository.findByIsbn(isbn);
            return books;
    }

    @GetMapping("/findByTitleandIsbn/{title}/{isbn}")
    public List<Book> findByTitleAndIsbn(@PathVariable String title,@PathVariable String isbn){
        List<Book> books = bookRepository.findByTitleAndIsbn(title, isbn);
        return books;
    }

    @GetMapping("/findallcount")
    public long findtotal(){
        return bookRepository.count();
    }

    @DeleteMapping("/delete/{id}")
    public void deletebyid(@PathVariable int id){
        bookRepository.deleteById(id);
    }
}
