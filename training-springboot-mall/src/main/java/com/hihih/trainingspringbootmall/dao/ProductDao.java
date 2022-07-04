package com.hihih.trainingspringbootmall.dao;

import com.hihih.trainingspringbootmall.dto.ProductRequest;
import com.hihih.trainingspringbootmall.model.Product;

import java.util.List;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);
}
