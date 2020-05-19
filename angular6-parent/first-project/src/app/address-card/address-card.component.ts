import { Component, OnInit, Input } from '@angular/core';
import { User } from './user.module';

@Component({
  selector: 'app-address-card',
  templateUrl: './address-card.component.html',
  styleUrls: ['./address-card.component.css']
})
export class AddressCardComponent implements OnInit {

  @Input('user') user:User;
  isCollapsed : boolean = true;
  buttonText:string="Expand";
  constructor() { }


  ngOnInit(): void {
  }

  toogleView(){
    this.isCollapsed=!this.isCollapsed;
    if(this.isCollapsed) {
      this.buttonText = "Expand";
    }else{
      this.buttonText = "Collapse";
    }
  }

}
