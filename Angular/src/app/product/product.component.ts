import {Component, OnInit} from '@angular/core';

import {CommonModule} from '@angular/common';

import {HttpClient, HttpClientModule} from '@angular/common/http';


@Component({
  selector: 'app-product',
  standalone: true,
  imports: [
    CommonModule,
    HttpClientModule
  ],
  templateUrl: './product.component.html',
  styleUrl: './product.component.css'
})

export class ProductComponent implements OnInit{
  // products : Product[] = []; // initialized the products array with an empty array []
  //                           // Because od Type Script's Strict Property Initialization Checks
  // // TypeScript always first check constructor and then ngInIt life cycle
  // constructor(private service : ProductListService) {
  products : any;
  constructor( private http: HttpClient) {
  }
  ngOnInit() {
    let response = this.http.get("http://localhost:8080/products");
    response.subscribe((data)=>this.products=data);
  }
}
  // ngOnInit(): void {
  // } This is just for one
 // ngOnInit(){ // This works as a way of injecting data once the application has loaded.
 //    this.products = this.service.getProducts();


