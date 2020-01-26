import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { FormGroup } from '@angular/forms';
import { Vehicle } from '../classes/vehicle';

@Injectable({
  providedIn: 'root'
})
export class VehicleService {

  url:string;
  url1:string;

  constructor(private _http3:HttpClient) { 

    this.url="http://localhost:8080/vehicleregister";
    this.url1="http://localhost:8080/vehicle";
  }

  registerVehicle(vehicle:FormGroup):Observable<any>{

    return this._http3.post(this.url,vehicle);
  }
  getAllVehicle():Observable<Vehicle>
  {
    return this._http3.get<Vehicle>(this.url1);
  }

}
