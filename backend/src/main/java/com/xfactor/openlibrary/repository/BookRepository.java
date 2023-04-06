package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.Book;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository <Book, Long>{
    //takes two value, one is entity itself and second is the
    

    List<Book> findByIsbn(String isbn);

    List<Book> findByTitleAndIsbn(String title, String isbn);

}
