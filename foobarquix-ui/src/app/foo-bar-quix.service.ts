import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private http:HttpClient) { }


  host : string = "http://localhost:8080/";

  convertNumber(number : number){
    return this.http.get(this.host + "foo-bar-quix/"+ number);
  }

}
