import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-info-add',
  templateUrl: './info-add.component.html',
  styleUrls: ['./info-add.component.css']
})
export class InfoAddComponent implements OnInit {

  employee =new Employee();

  constructor(private router : Router, 
    private empServ : EmployeeService) { 
      
    }

  ngOnInit(): void {
  }

  onSubmit(){
    let obj = {
      "name" : this.employee.name,
      "email" : this.employee.email ,
      "phone_No": this.employee.phone_No,     
      "address": this.employee.address,
    }
    this.empServ.saveEmpDetails(obj).subscribe(resp=> {
      alert('Employee Adeed');
      this.router.navigate(['/EMPlist']);

      // console.log(resp);
    });
  }
  

}
