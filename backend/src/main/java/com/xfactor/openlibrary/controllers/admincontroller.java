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

import com.xfactor.openlibrary.domain.admin;
import com.xfactor.openlibrary.repository.AdminRepository;

@RestController
@RequestMapping("admin")
public class admincontroller {

    private AdminRepository adminRepository;

    //ArrayList<admin> ladmin = new ArrayList<a>();
    
    public admincontroller(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }


    @PostMapping("/saveadmins")
    public admin saveadmindetails(@RequestBody admin admin1){   
        if(admin1.getId() == null){
            admin admin2 = adminRepository.save(admin1);
            return admin2;
        }
        return null;
    }

    @PutMapping("/updateadmins")
    public admin updateadmindetails(@RequestBody admin admin1){   
        if(admin1.getId() != null){
            admin admin2 = adminRepository.save(admin1);
            return admin2;
        }
        return null;
    }



    @GetMapping("/getAlladminDetails")
    public List<admin> getAllloans(){
        return adminRepository.findAll();
    }

    @GetMapping("getbyid/{id}")
    public admin findbyid(@PathVariable Long id){
        Optional<admin> optional = adminRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("/findall")
    public long findall(){
        return adminRepository.count();
    }

    @DeleteMapping("/deletebyid/{id}")
    public void deletebyid(@PathVariable Long id){
        adminRepository.deleteById(id);
    }

}