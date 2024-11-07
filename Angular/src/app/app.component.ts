import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import {ShoppingComponent} from './shopping/shopping.component';
import {ProductComponent} from './product/product.component';
import {FormsModule} from '@angular/forms';
import {NavbarComponent} from './navbar/navbar.component';
import {Productlist2Component} from './productlist2/productlist2.component';

@Component({
  selector: 'app-root',  // If the selector is removed then we can't do data binding
  standalone: true,
  imports: [RouterOutlet, ShoppingComponent, ProductComponent, FormsModule, NavbarComponent, Productlist2Component],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Simple Books!';
  customer = ''
  currentSearch = "search results"
  updateSearch(value: string){
    this.currentSearch = value;
  }
}
