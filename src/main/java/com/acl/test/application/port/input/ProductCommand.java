package com.acl.test.application.port.input;

import com.acl.test.domain.Product;

import java.util.List;

public interface ProductCommand {
    List<Product> getAllProducts();
    Product getProduct(Integer id);
    void saveProduct(Product product);
    void updateProduct(Integer id, Product product);
    void deleteProduct(Integer id);
}

