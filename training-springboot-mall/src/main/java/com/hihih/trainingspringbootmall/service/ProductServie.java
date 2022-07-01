package com.hihih.trainingspringbootmall.service;

import com.hihih.trainingspringbootmall.dto.ProductRequest;
import com.hihih.trainingspringbootmall.model.Product;

public interface ProductServie {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
