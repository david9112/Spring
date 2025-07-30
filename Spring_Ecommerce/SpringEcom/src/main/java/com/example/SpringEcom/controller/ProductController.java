package com.example.SpringEcom.controller;

import com.example.SpringEcom.model.Product;
import com.example.SpringEcom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id){
        Product product = productService.getProductById(id);
        if(product!=null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile){
        Product savedProduct = null;
        try {
            savedProduct = productService.addOrUpdateProduct(product,imageFile);
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
        }
        catch (IOException e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.CREATED);
        }
    }

    @GetMapping("product/{productId}/image")
    public Object getImageByProductId(@PathVariable int productId){

        Product product1= productService.getProductById(productId);

        if (product1 == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(product1.getImageData(),HttpStatus.OK);
    }

    @PutMapping("product/{id}")
    public ResponseEntity<String> updateProduct(@PathVariable int id,@RequestPart Product product, @RequestPart MultipartFile imageFile){
        Product updatedProduct= null;
        try
        {
            updatedProduct = productService.addOrUpdateProduct(product,imageFile);
            return new ResponseEntity<>("updated!",HttpStatus.OK);
        }
        catch (IOException e)
        {
            return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("product/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        if(productService.getProductById(id) != null)
        {
            productService.deleteProduct(id);
            return new ResponseEntity<>("deleted!",HttpStatus.OK);
        }
        return  new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("products/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> products = productService.searchProducts(keyword);
        System.out.println("Searching: "+keyword);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
