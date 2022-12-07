import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { ProductAppModule } from './product-app/product-app.module';



@NgModule({
  declarations: [
    
    AppComponent,
   
  ],
  imports: [
    ProductAppModule,
    BrowserModule,
    AppRoutingModule,
   
    NgbModule,
    BrowserAnimationsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
