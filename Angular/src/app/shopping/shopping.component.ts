import { Component, Output, EventEmitter } from '@angular/core';
import {FormsModule} from '@angular/forms';

@Component({
  selector: 'app-shopping',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './shopping.component.html',
  styleUrl: './shopping.component.css'
})
export class ShoppingComponent {
    search='book Name'
    @Output() searchChange = new EventEmitter<string>();
    onSearchChange(){
      this.searchChange.emit(this.search);
    }
}
