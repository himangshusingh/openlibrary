import { Component } from '@angular/core';
// this is a component decorator imported from angular/core
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'openlibrary';
}
