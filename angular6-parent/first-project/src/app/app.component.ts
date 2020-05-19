import { Component } from '@angular/core';
import { User } from './address-card/user.module';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'first-project';
  inputText = "myText";

  user:User;
  constructor() {
    this.user = new User();
    this.user.name = "Naresh",
    this.user.address = "Chan";
    this.user.designation = "Sof";
    this.user.phone = ["2421321321", "32432432432"];
  }
}
