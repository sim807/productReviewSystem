import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../models/user';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  msg: any;
  user = new User();
  constructor(private service: ServiceService, private router: Router) { }

  ngOnInit(): void {
  
  }

  registerUser(){
   
    this.service.registerUser(this.user).subscribe(
      data => {console.log("Success!")
     
      this.service.setUser(data);
      this.service.isLoggedIn = true;
      this.router.navigate(['login']);
      },
      err => {console.log("Error!"),
       this.msg = "Please Check Your Email | Password"})
      {
        
      }
    
  }

}
