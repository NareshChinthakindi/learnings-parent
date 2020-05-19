import { Component, Inject } from '@angular/core';
import { TestService } from './test.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   
  constructor(private testService:TestService, private httpClient : HttpClient) {
     testService.printConsoleLog("Hello Naresh");
  }


  ngOnInit() {
   let obs =this.httpClient.get('https://api.github.com/users/NareshChinthakindi');
  //  obs.subscribe(() =>console.log("Got the response"));
  obs.subscribe((response) =>console.log(response));
  }
}
