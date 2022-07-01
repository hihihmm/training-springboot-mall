package com.hihih.trainingspringbootmall.service.impl;

import com.hihih.trainingspringbootmall.dao.ProductDao;
import com.hihih.trainingspringbootmall.dto.ProductRequest;
import com.hihih.trainingspringbootmall.model.Product;
import com.hihih.trainingspringbootmall.service.ProductServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductServie {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {

        return productDao.getProductById(productId);
    }

    @Override
    public Integer createProduct(ProductRequest productRequest) {
        return productDao.createProduct(productRequest);
    }
}
