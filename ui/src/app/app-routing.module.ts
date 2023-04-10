import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BookComponent } from './book/book.component';
import { StudentComponent } from './student/student.component';
import { LoanComponent } from './loan/loan.component';
import { PublisherComponent } from './publisher/publisher.component';
import { AuthorComponent } from './author/author.component';
import { AdminComponent } from './admin/admin.component';
import { SidenavComponent } from './sidenav/sidenav.component';
import { HelloComponent } from './hello/hello.component';
import { AddBooksComponent } from './add-books/add-books.component';
import { AddStudentsComponent } from './add-students/add-students.component';
import { AddAuthorsComponent } from './add-authors/add-authors.component';
import { AddPublishersComponent } from './add-publishers/add-publishers.component';
import { AddAdminsComponent } from './add-admins/add-admins.component';
import { AddLoansComponent } from './add-loans/add-loans.component';

const routes: Routes = [
  {
    path: '',
    component: HelloComponent,
  },  
  {
    path: 'books',
    component: BookComponent,
  },
  {
    path: 'students',
    component: StudentComponent,
  },
  {
    path: 'loans',
    component: LoanComponent,
  },
  {
    path: 'publishers',
    component: PublisherComponent,
  },
  {
    path: 'authors',
    component: AuthorComponent,
  },
  {
    path: 'admins',
    component: AdminComponent,
  },
  {
    path: 'sidenav',
    component: SidenavComponent,
  },
  {
    path: 'landingpage',
    component: HelloComponent,
  },
  {
    path: 'add-books',
    component: AddBooksComponent,
  },
  {
    path: 'add-students',
    component: AddStudentsComponent, 
  },
  {
    path: 'add-authors',
    component: AddAuthorsComponent,
  },
  {
    path: 'add-publishers',
    component: AddPublishersComponent,
  },
  {
    path: 'add-admins',
    component: AddAdminsComponent,
  },
  {
    path: 'add-loans',
    component: AddLoansComponent,
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
