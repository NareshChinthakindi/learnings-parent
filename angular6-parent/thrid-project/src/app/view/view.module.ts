import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms'
import { CommonModule } from '@angular/common';
import { ViewComponentComponent } from './view-component/view-component.component';



@NgModule({
  declarations: [ViewComponentComponent],
  imports: [
    CommonModule,
    FormsModule
  ],
  exports:[
    ViewComponentComponent
  ]
})
export class ViewModule { }
