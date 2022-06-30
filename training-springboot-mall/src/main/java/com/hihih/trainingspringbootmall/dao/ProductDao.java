package com.hihih.trainingspringbootmall.dao;

import com.hihih.trainingspringbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
