import { Component, OnInit } from '@angular/core';
import { TestService } from 'src/app/test.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-view-component',
  templateUrl: './view-component.component.html',
  styleUrls: ['./view-component.component.css']
})
export class ViewComponentComponent implements OnInit {

  constructor(private httpClient:HttpClient) { 
    
  }

  userName:string="";
  response:any;

  ngOnInit(): void {
  }

  search() {
    let obs =this.httpClient.get('https://api.github.com/users/'+this.userName);
    //  obs.subscribe(() =>console.log("Got the response"));
    obs.subscribe((response) =>{
      this.response = response;
      console.log(response);
    });
  }

}
