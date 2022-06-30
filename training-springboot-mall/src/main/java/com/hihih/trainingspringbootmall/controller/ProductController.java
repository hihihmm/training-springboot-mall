package com.hihih.trainingspringbootmall.controller;

import com.hihih.trainingspringbootmall.model.Product;
import com.hihih.trainingspringbootmall.service.ProductServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductServie productServie;

    @GetMapping("/products/{productid}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productid){

        Product product = productServie.getProductById(productid);

        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
