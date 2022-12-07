import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ServiceService } from '../service.service';

@Component({
  selector: 'app-request-reviews',
  templateUrl: './request-reviews.component.html',
  styleUrls: ['./request-reviews.component.css']
})
export class RequestReviewsComponent implements OnInit {

  rt = 0;
  reviews: any;
  constructor(private service: ServiceService,private router: Router) { }

  ngOnInit(): void {
  }

  requestReview(form : any){
    let newPost = {
      productName: form.value.productName,
      brand: form.value.brand,
      productCode: form.value.productCode,
    }
    console.log(newPost);
    this.service.reviewRequest(newPost).subscribe(
      (data)=>{ 
        this.reviews = data;
        this.rt = 1;
      },
      (err)=>{console.log(err)}
    )
  }

  logout(){
    this.service.logout();
    this.router.navigate(['login']);
  }

  loggedIn(){
    return this.service.isLogIn();
  }
  currentUser(){
    return this.service.getUser().firstName+" "+this.service.getUser().lastName;
  }

}
