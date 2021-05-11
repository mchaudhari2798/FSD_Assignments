import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './employee-list/employee-list.component';

import {InfoAddComponent} from './info-add/info-add.component'
import {PageNotFoundComponent} from './page-not-found/page-not-found.component'


const routes: Routes = [
  { path:'', redirectTo:"/Employees", pathMatch :'full'},
  { path: 'AddEmployee', component: InfoAddComponent},  
  { path: 'EMPlist', component : EmployeeListComponent},
  { path: '**' , component : PageNotFoundComponent}, 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
