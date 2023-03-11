package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository <Student, Integer>{
    
    

}
