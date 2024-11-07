import {Component, OnInit} from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';

import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-productlist2',
  standalone: true,
  imports: [
    CommonModule,
    HttpClientModule
  ],
  templateUrl: './productlist2.component.html',
  styleUrl: './productlist2.component.css'
})
export class Productlist2Component {
  moreProducts : any;
  constructor(private http: HttpClient) {


  }
  ngOnInit() {

    let response = this.http.get("http://localhost:8080/products");
    response.subscribe((data)=>this.moreProducts=data);
  }


}
