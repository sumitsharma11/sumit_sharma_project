import { Component, OnInit } from '@angular/core';
import { LoginService } from 'src/shared/services/login.service';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.css']
})
export class NavbarComponent implements OnInit {

  constructor(private loginSer:LoginService) { }

  ngOnInit() {
  }
  checkLogin():boolean{
    return this.loginSer.checkSession();
  }
  logout(){
    sessionStorage.clear();
  }

}
