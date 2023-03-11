package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<admin, Integer>{
    
}
