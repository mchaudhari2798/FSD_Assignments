import { HttpClient} from '@angular/common/http';
import { CATCH_ERROR_VAR } from '@angular/compiler/src/output/output_ast';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  [x: string]: any;

  private listEmp = "http://localhost:8080/Employees/all";
  private saveEmp = "http://localhost:8080/Employees/";
  private deleteEmp = "http://localhost:8080/Employees/delete/";

  constructor( private http : HttpClient) { }

  // getEmplopyeeList():Observable<Employee[]>{
  //   // return this.httpclient.get<Employee[]>(`${this.listEmp}`);
    
  // }

  saveEmpDetails(obj :any ){
    return this.http.post(this.saveEmp, obj)
  }

  getEmployeeList(){
    return this.http.get(this.listEmp)
  }

  getEmployeeById(id: number): Observable<Employee>{
    return this.http.get<Employee>(`${this.baseURL}/${id}`);
  }

  deleteEmployee(id:number){
    return this.http.delete(this.deleteEmp + id );
  }
}
