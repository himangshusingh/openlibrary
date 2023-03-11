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

const routes: Routes = [
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
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
