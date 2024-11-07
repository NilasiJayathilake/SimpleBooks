package com.example.notsosimpleshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public ProductEntity addProduct(@RequestBody ProductEntity product){
        return service.saveProduct(product);
    }
    @PostMapping("/addProducts")
    public List <ProductEntity> addProducts(@RequestBody List<ProductEntity> products) {
        return service.saveAllProducts(products);
    }
    @GetMapping("/findProductByID/{id}") // at first the path said ("/findProduct/{id}") we changed to ("/findProductByID")
    public ProductEntity findProduct(@PathVariable int id){
        return  service.getProductById(id);
    }
    // since both these have the same paths the url don't know what we are trying to acess
    // because it cannot identify the type of dynamic paarmeter we enter
    // so we need to change the path a bit

    @GetMapping("/products")
    public List<ProductEntity> findAllProducts(){
        return service.getProducts();
    }
    @GetMapping("/findProduct/{name}")
    public ProductEntity findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }
    @PutMapping("/update")
    public ProductEntity updateProduct(@RequestBody ProductEntity product){
        return service.updateProduct(product);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return  service.deleteProduct(id);
    }
    @GetMapping("filterPrice/{price}")
    public List<ProductEntity> sortByPrice(@PathVariable double price){
        return service.getProductByPrice(price);
    }
    @GetMapping("/availability")
    public String sortAvailability(){
        List<ProductEntity> available= service.getProductsByQuantity();
        StringBuilder result=new StringBuilder();
        for (ProductEntity product: available){
            result.append(product.toString()).append("- Available\n");}
        return result.toString();
    }
    // A Method for Buying
    @PutMapping("/buy/{id}")
    public Optional<ProductEntity> Buy(@PathVariable int id){
        return service.updateQuantityOfProduct(id);
    }



}
