import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from '../classes/user';
import { FormGroup } from '@angular/forms';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  url:string;
  constructor(private _http:HttpClient) {
    this.url="http://localhost:8080";
   }

   login(user:FormGroup):Observable<any>{
     return this._http.post(this.url+"/login",user);
   }
   checkSession():boolean{
     if(sessionStorage.getItem("user")!=null){
       return true;
     }
     else{
       return false;
     }
   }
}
