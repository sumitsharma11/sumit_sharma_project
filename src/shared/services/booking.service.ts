import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormGroup } from '@angular/forms';
import { Observable } from 'rxjs';
@Injectable({
  providedIn: 'root'
})
export class BookingService{
  url:string;
  constructor(private _http2:HttpClient) {
    this.url="http://localhost:8080/booking"
   }
   bookingVehicle(booking:FormGroup):Observable<any>{
    return this._http2.post(this.url,booking);
  }
}
