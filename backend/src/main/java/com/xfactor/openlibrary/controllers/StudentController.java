package com.xfactor.openlibrary.controllers;
import java.util.List;
import java.util.Optional;

//import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Student;
import com.xfactor.openlibrary.repository.StudentRepository;

@RestController
@RequestMapping("student")
public class StudentController {

    private StudentRepository studentRepository;

    //ArrayList<Student> lstudent = new ArrayList<>();
    
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/savedetailsofstudents")
    public Student savestuddetails(@RequestBody Student stud){   
        if(stud.getId() == null){
            Student stud1 = studentRepository.save(stud);
            return stud1;
        }
    return null;
    }

    @PutMapping("/updatedetailsofstudents")
    public Student updatestudentdetails(@RequestBody Student stud){
        if(stud.getId() != null ){
            Student stud1 = studentRepository.save(stud);
            return stud1;
        }
        return null;
    }

    @GetMapping("/getAllstudentDetails")
    public List<Student> getAllstudentDetails(){
        return studentRepository.findAll();
    }

    @GetMapping("findstudentbyId")
    //we use optional here
    public Student findbyid(@PathVariable int id){
        Optional<Student> optional = studentRepository.findById(id);
        if(optional.isPresent())
            return optional.get();
        else
            return null;
    }

    @GetMapping("/getcountofstudents")
    public long findtotal(){
        return studentRepository.count();
    }

    @DeleteMapping("/deleteentryofstudent/{id}")
    public void deletebyid(@PathVariable int id){ //why delete by id is passing by int when we declalred id by Long
        studentRepository.deleteById(id);
    }
}