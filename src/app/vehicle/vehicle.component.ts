import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { VehicleService } from 'src/shared/services/vehicle.service';

@Component({
  selector: 'app-vehicle',
  templateUrl: './vehicle.component.html',
  styleUrls: ['./vehicle.component.css']
})
export class VehicleComponent implements OnInit {

  vregForm:FormGroup;
  constructor(private fb:FormBuilder,private vehicleService:VehicleService) {

    this.vregForm=this.fb.group({
      vehicleName:[''],
      rent:[''],
      image:[''],
    // user:JSON.parse(sessionStorage.getItem("user"))
    });
   }

   show3(){  
    this.vehicleService.registerVehicle(this.vregForm.value).subscribe(v=>
      {
      alert(v); 
   });
  }

  ngOnInit() {
  }

}
