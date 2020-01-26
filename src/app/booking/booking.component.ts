
import { Component, OnInit } from '@angular/core';
import {FormBuilder,FormGroup,FormControl} from '@angular/forms';
import {BookingService} from 'src/shared/services/booking.service';
@Component({
  selector: 'app-booking',
  templateUrl: './booking.component.html',
  styleUrls: ['./booking.component.css']
})
export class BookingComponent implements OnInit {
bregForm:FormGroup;
  constructor(private fb:FormBuilder,private bookingService:BookingService) {
  
    this.bregForm=this.fb.group({
      bookingDate:[''],
     bookingAmount:[''],
     user:JSON.parse(sessionStorage.getItem("user"))
    });
   }
  
  
   show2(){  
    this.bookingService.bookingVehicle(this.bregForm.value).subscribe(b=>
      {
      alert(b); 
   });
  }
  
  ngOnInit() {
  }

}
