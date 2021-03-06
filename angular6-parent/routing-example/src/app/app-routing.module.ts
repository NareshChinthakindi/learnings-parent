import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { SettingsComponent } from './settings/settings.component';
import { PateNotFoundComponent } from './pate-not-found/pate-not-found.component';
import { SettingsProfileComponent } from './settings-profile/settings-profile.component';
import { SettingsContactComponent } from './settings-contact/settings-contact.component';


const routes: Routes = [
  {
    path:'', redirectTo:'/home', pathMatch:'full'
  },
  {
    path:'home', component:HomeComponent
  },
  {
    path:'settings',
    component: SettingsComponent,
    children: [
      {
        path:'', redirectTo:'profile', pathMatch:'full'
      },
      {
        path:'profile',
        component:SettingsProfileComponent
      },
      {
        path:'contact',
        component:SettingsContactComponent
      }
      
    ]
  },
  {
    path:'**', component:PateNotFoundComponent
  }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
