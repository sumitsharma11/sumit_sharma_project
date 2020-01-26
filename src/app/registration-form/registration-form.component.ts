import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,FormControl} from '@angular/forms';
import { UserService } from 'src/shared/services/user.service';
@Component({
  selector: 'app-registration-form',
  templateUrl: './registration-form.component.html',
  styleUrls: ['./registration-form.component.css']
})
export class RegistrationFormComponent implements OnInit {
  regForm:FormGroup;
  constructor(private fb:FormBuilder,private userService:UserService) {

    this.regForm=this.fb.group({
      name:[''],
      contact:[''],
      address:[''],
      email:[''],
      password:['']
    });
   }

   show(){  
    this.userService.registerUser(this.regForm.value).subscribe(u=>
      {
      alert(u); 
   });
  }
  ngOnInit() {
  }

}
