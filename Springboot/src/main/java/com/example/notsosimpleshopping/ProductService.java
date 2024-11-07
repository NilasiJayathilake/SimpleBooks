package com.example.notsosimpleshopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    // service to save a product
    public ProductEntity saveProduct(ProductEntity product){
        return repository.save(product);
    }
    // To save all products
    public List<ProductEntity> saveAllProducts(List<ProductEntity> products){
        return repository.saveAll(products);
    }
    // To get all products
    public List<ProductEntity> getProducts(){
        return repository.findAll();
    }
    public ProductEntity getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    public  List<ProductEntity> getProductByPrice(double price){
        return repository.findAllByPriceIsLessThanOrderByPriceAsc(price);
    }
    public List<ProductEntity> getProductsByQuantity(){
        return repository.findAllByQuantityGreaterThan(0);
    }

    public ProductEntity getProductByName(String name) {
        return repository.findByName(name);
    }
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    public ProductEntity updateProduct(ProductEntity product) {
        ProductEntity existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }
    public Optional<ProductEntity> updateQuantityOfProduct(int id){
        ProductEntity existingProduct = getProductById(id);
        existingProduct.setQuantity(existingProduct.getQuantity()-1);
        return repository.findById(id);
    }


}






