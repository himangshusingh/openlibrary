package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository <Author, Long>{
    
}
