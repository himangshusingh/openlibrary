import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import {FormBuilder , FormGroup, Validators} from '@angular/forms'
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-students',
  templateUrl: './add-students.component.html',
  styleUrls: ['./add-students.component.css']
})
export class AddStudentsComponent implements OnInit {
  studentsForm : FormGroup;
  constructor(private formbuilder: FormBuilder, private http: HttpClient, private router: Router ) { 
    this.studentsForm = this.formbuilder.group({
      name: ['hello', Validators.required],
      department: [],
      rollNumber: [],
      brithDate: [],
      number: []
    })
  }

  ngOnInit(): void {
  }

  saveStudent(){    
    let studentData = this.studentsForm.value;
    // Handle date to string
    this.http.post('http://localhost:8080/student/savestudent',studentData)
    .subscribe(response => {
      console.log('Student saved to DB', response)
      this.router.navigateByUrl('/student')
    }, error =>{
      console.error("Error in student save", error)
    }
    );

  }
}