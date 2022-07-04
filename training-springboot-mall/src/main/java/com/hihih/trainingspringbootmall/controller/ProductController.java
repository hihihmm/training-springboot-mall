package com.hihih.trainingspringbootmall.controller;

import com.hihih.trainingspringbootmall.dto.ProductRequest;
import com.hihih.trainingspringbootmall.model.Product;
import com.hihih.trainingspringbootmall.service.ProductServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductServie productServie;

    @GetMapping("/products/{productId}")
    public ResponseEntity<Product> getProduct(@PathVariable Integer productId){

        Product product = productServie.getProductById(productId);

        if(product != null){
            return ResponseEntity.status(HttpStatus.OK).body(product);
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(
            @RequestBody @Valid ProductRequest productRequest
            ){
        Integer productId = productServie.createProduct(productRequest);

        Product product = productServie.getProductById(productId);

        return ResponseEntity.status(HttpStatus.CREATED).body(product);

    }

    @PutMapping("/products/{productId}")
   public ResponseEntity<Product> updateProduct(
           @PathVariable Integer productId,
           @RequestBody @Valid ProductRequest productRequest
   ){
        // 檢查 productId 是否存在
        Product product = productServie.getProductById(productId);

        if(product == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        // 修改商品數據
        productServie.updateProduct(productId, productRequest);

        Product updateProduct = productServie.getProductById(productId);

        return ResponseEntity.status(HttpStatus.OK).body(updateProduct);

   }
}
