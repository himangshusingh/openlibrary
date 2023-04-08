package com.xfactor.openlibrary.repository;
import com.xfactor.openlibrary.domain.Loan;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface LoanRepository extends JpaRepository <Loan,Long> {
    
}
