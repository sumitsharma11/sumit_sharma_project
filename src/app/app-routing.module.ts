import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { RegistrationFormComponent } from './registration-form/registration-form.component';
import { LoginFormComponent } from './login-form/login-form.component';
import { BookingComponent } from './booking/booking.component';
import { VehicleComponent } from './vehicle/vehicle.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { VehicleListComponent } from './vehicle-list/vehicle-list.component';
import { ContactComponent } from './contact/contact.component';
import { BooklistComponent } from './booklist/booklist.component';


const routes: Routes = [{path:'home',component: HomeComponent},
{path: 'registrationform',component: RegistrationFormComponent},
{path: 'loginform',component: LoginFormComponent},
{path: 'booking',component: BookingComponent},
{path: 'vehicle',component: VehicleComponent},
{path: 'vehiclelist',component: VehicleListComponent},
{path: 'contact',component: ContactComponent},
{path: 'booklist',component: BooklistComponent},
{path: '',component: PagenotfoundComponent}];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
