package com.hihih.trainingspringbootmall.service;

import com.hihih.trainingspringbootmall.dto.ProductRequest;
import com.hihih.trainingspringbootmall.model.Product;

import java.util.List;

public interface ProductServie {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

}
