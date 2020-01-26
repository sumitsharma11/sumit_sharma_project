import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/shared/services/login.service';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Authentication } from 'src/shared/classes/authentication';
import { User } from 'src/shared/classes/user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  loginForm:FormGroup;
  authentication:Authentication;
  user:User;
  constructor(private loginService:LoginService,private fb:FormBuilder,private router:Router) {

    this.loginForm=this.fb.group({
      email:[''],
      password:['']
    });


   }

   loginUser(){



    this.loginService.login(this.loginForm.value).subscribe((u)=>{
      
      this.user=u
      if(this.user!=null){

         sessionStorage.setItem("user",JSON.stringify(this.user))
         
         
         this.router.navigate(["/home"]);


      }
      else{
        this.router.navigate(['/registrationform'])
      }

    }
    )

   }
  ngOnInit() {
  }

}
