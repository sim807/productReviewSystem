import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddReviewsComponent } from './add-reviews/add-reviews.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { RequestReviewsComponent } from './request-reviews/request-reviews.component';
import { ShowReviewsComponent } from './show-reviews/show-reviews.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { authInterceptorProviders } from './auth.interceptor';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { MatButtonModule} from '@angular/material/button'
import {MatCardModule} from '@angular/material/card';
import {MatInputModule} from '@angular/material/input';
import { MatFormFieldModule } from '@angular/material/form-field'
import { ProductAppRoutingModule } from './product-app-routing.module';
import {MatIconModule} from '@angular/material/icon';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatListModule} from '@angular/material/list';
import { NgbRating, NgbRatingModule } from '@ng-bootstrap/ng-bootstrap';
import { DashboardComponent } from './admin/dashboard/dashboard.component';
import { ProductsComponent } from './admin/products/products.component';
import { SidebarComponent } from './admin/sidebar/sidebar.component';
import { UsersComponent } from './admin/users/users.component';
import { ReviewsComponent } from './admin/reviews/reviews.component';
import { AddProductComponent } from './admin/products/add-product/add-product.component';
// import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
// import { NgbRating } from '@ng-bootstrap/ng-bootstrap';



@NgModule({
  declarations: [
    AddReviewsComponent,
    HomeComponent,
    LoginComponent,
    RegisterComponent,
    RequestReviewsComponent,
    ShowReviewsComponent,
    DashboardComponent,
    ProductsComponent,
    SidebarComponent,
    UsersComponent,
    ReviewsComponent,
    AddProductComponent
  ],
  imports: [
    

    CommonModule,
    ProductAppRoutingModule,
    ReactiveFormsModule,
    
    MatFormFieldModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    MatGridListModule,
    FormsModule,
    HttpClientModule,
    MatCardModule,
    MatListModule,
    NgbRatingModule
    // NgbModule
  ],
  
  providers: [authInterceptorProviders]
})
export class ProductAppModule { }
