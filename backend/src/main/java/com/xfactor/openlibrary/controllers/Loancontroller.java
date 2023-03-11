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

import com.xfactor.openlibrary.domain.Loan;
import com.xfactor.openlibrary.repository.LoanRepository;

@RestController
@RequestMapping("loan")
public class Loancontroller{
    //ArrayList<loan> lloan = new ArrayList<>();
    
    private LoanRepository loanRepository;

    public Loancontroller(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }
    
    @PostMapping("/saveloansofstudents")
    public Loan saveloandetails(@RequestBody Loan loan ){   
        if(loan.getId() == null){
            Loan loan1 = loanRepository.save(loan);
            return loan1;
        }
        return null;
    }

    @PutMapping("/updateloansofstudents")
    public Loan updateloandetails(@RequestBody Loan loan ){   
        if(loan.getId() != null){
            Loan loan1 = loanRepository.save(loan);
            return loan1;
        }
        return null;
    }

    @GetMapping("/getAllloanDetails")
    public List<Loan> getAllloans(){
        return loanRepository.findAll();
    }

    @GetMapping("/getbyid/{id}")
    public Loan findbyid(@PathVariable int id){
        Optional<Loan> optional= loanRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("findallcount")
    public long findallloan(){
        return loanRepository.count();
    }

    @DeleteMapping("deleteloanbyid/{id}")
    public void deleteloanbyid(@PathVariable int id){
        loanRepository.deleteById(id);
    }
}