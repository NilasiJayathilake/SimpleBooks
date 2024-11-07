import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductListService {
   constructor(private http : HttpClient) {
   }
   getProducts(){
     return this.http.get("http://localhost:8080/products");
   }

}
