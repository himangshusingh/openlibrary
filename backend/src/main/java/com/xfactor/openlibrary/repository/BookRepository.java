package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.Book;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Integer>{
    //takes two value, one is entity itself and second is the
    

    List<Book> findByIsbn(String isbn);

    List<Book> findByTitleAndIsbn(String title, String isbn);
}
