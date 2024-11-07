import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {FormsModule} from '@angular/forms';
import {Provider} from '@angular/core';
import {ProductListService} from './product-list.service';
import {HttpClientModule} from '@angular/common/http';
import {BrowserModule} from '@angular/platform-browser';
import {Productlist2Component} from './productlist2/productlist2.component';




@NgModule({
  declarations: [],
  imports: [
    BrowserModule,
    HttpClientModule,
    CommonModule,
    FormsModule,
  ],

})
export class AppModule { }
