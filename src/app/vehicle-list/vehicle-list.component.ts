import { Component, OnInit } from '@angular/core';
import { VehicleService } from 'src/shared/services/vehicle.service';
import { Vehicle } from 'src/shared/classes/vehicle';

@Component({
  selector: 'app-vehicle-list',
  templateUrl: './vehicle-list.component.html',
  styleUrls: ['./vehicle-list.component.css']
})
export class VehicleListComponent implements OnInit {
 
  vehicle:Vehicle;
  
  
 constructor(private vehicleService:VehicleService) {
   this.vehicleService.getAllVehicle().subscribe(v=>this.vehicle=v)
   
  }

  ngOnInit() {
  }

}
