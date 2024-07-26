import { Component } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { of } from 'rxjs';
import { CustomerTS } from '../../types/tstypes/Customerts';

@Component({
  selector: 'app-customerarray',
  //standalone: true,
  //imports: [],
  templateUrl: './customerarray.component.html',
  styleUrls: ['./customerarray.component.css']
})
export class CustomerarrayComponent {
  customers: CustomerTS[]=[
    
    new CustomerTS("Joe Doe","joe@gmail.com","joe123","Computer Engineering","1"),
    new CustomerTS("John Deen","john@gmail.com","john123","Electronic Engineering","2"),
    new CustomerTS("Vill Veen","vill@gmail.com","vill123","Civil Engineering","3"),
  ];
}
      
