import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css']
})
export class EmployeeListComponent implements OnInit {

  id :number | undefined
employees: any;

  constructor(private route : ActivatedRoute,
     private employeeService : EmployeeService) { }

  ngOnInit(): void {
    this.getEmployees();
    
    this.id = this.route.snapshot.params['id'];
      
  }

  private getEmployees(){
    this.employeeService.getEmployeeList().subscribe(data => {
      this.employees =  data;
      console.log(data)
    });
  }

  deleteEmplopyee(id :number){
    console.log(id);
    this.employeeService.deleteEmployee(id).subscribe(data =>{
      console.log(data);
      this.getEmployees();
    })
  }
  

  

}
