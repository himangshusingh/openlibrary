import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-book',
  templateUrl: './book.component.html',
  styleUrls: ['./book.component.css']
})
export class BookComponent implements OnInit {

  title = 'Book Management'
  books: any = []
  isGreen = true


  constructor(private router: Router, private http: HttpClient) { }


  ngOnInit(): void {
    this.fetchAllBooks();
  }

  AddBooks(){
    console.log("AddBooks button is clicked !!!")
    this.router.navigateByUrl('/add-books')
  }


  fetchAllBooks(){
    this.http.get('http://localhost:8080/books/getAll')
    .subscribe(resp =>{
      this.books = resp;
      console.log('Books retrieved successfully:', this.books)
    }, error => {
      console.error('Error retrieving books:', error);
    });
  }

  deleteBook(bookId:Number){
    
    const url = 'http://localhost:8080/books/delete/' +bookId
    console.log(url)
    this.http.delete(url)
    .subscribe(resp => {
      console.log('Book deleted successfully');
      this.fetchAllBooks()
    }, error => {
      console.error('Error deleting book:', error);
    });
  }
}
