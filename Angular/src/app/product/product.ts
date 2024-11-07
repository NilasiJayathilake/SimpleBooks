export class Product{
  id : number;
  name : String;
  quantity : number;
  price : number;
  constructor(id: number, name: string, price: number, quantity: number) {
    this.id = id;
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}}
